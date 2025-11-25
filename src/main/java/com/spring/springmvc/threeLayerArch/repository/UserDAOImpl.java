package com.spring.springmvc.threeLayerArch.repository;

import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.spring.springmvc.threeLayerArch.model.User;

public class UserDAOImpl implements UserDAO {

    private JdbcTemplate jdbc;

    public UserDAOImpl(JdbcTemplate jdbcTemplate) {
        this.jdbc = jdbcTemplate;
    }

    private final RowMapper<User> mapper = (rs, rowNum) -> {
        User u = new User();
        u.setId(rs.getLong("id"));
        u.setEmail(rs.getString("email"));
        u.setUserName(rs.getString("user_name"));
        u.setPassword(rs.getString("password"));
        return u;
    };

    @Override
    public int insert(User user) {
        return jdbc.update(
            "INSERT INTO users (email, user_name, password) VALUES (?, ?, ?)",
            user.getEmail(), user.getUserName(), user.getPassword());
    }

    @Override
    public User findById(Long id) {
        List<User> list = jdbc.query("SELECT * FROM users WHERE id = ?", mapper, id);
        return list.isEmpty() ? null : list.get(0);
    }

    @Override
    public List<User> findAll() {
        return jdbc.query("SELECT * FROM users", mapper);
    }

    @Override
    public int update(User user) {
        return jdbc.update(
            "UPDATE users SET email=?, user_name=?, password=? WHERE id=?",
            user.getEmail(), user.getUserName(), user.getPassword(), user.getId());
    }

    @Override
    public int deleteById(Long id) {
		return jdbc.update("DELETE FROM users WHERE id=?", id);
	}
}
