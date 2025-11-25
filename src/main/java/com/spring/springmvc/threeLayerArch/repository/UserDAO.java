package com.spring.springmvc.threeLayerArch.repository;

import java.util.List;

import com.spring.springmvc.threeLayerArch.model.User;

public interface UserDAO {
	int insert(User user);

	int update(User user);

	int deleteById(Long id);

	User findById(Long id);

	List<User> findAll();
}
