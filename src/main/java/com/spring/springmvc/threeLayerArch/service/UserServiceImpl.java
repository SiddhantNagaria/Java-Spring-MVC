package com.spring.springmvc.threeLayerArch.service;

import java.util.List;
import java.util.stream.Collectors;


import com.spring.springmvc.threeLayerArch.dto.UserDTO;
import com.spring.springmvc.threeLayerArch.exceptions.UserNotFoundException;
import com.spring.springmvc.threeLayerArch.model.User;
import com.spring.springmvc.threeLayerArch.repository.UserDAO;

public class UserServiceImpl implements UserService {

	private final UserDAO repo;

	public UserServiceImpl(UserDAO repo) {
		this.repo = repo;
	}

	private UserDTO toDTO(User u) {
		return new UserDTO(u.getId(), u.getEmail(), u.getUserName());
	}

	private User toEntity(UserDTO d) {
		return new User(d.getId(), d.getEmail(), d.getUserName(), null);
	}

	@Override
	public UserDTO create(UserDTO dto) {
		User u = toEntity(dto);
		u.setPassword("default");
		repo.insert(u);
		return toDTO(u);
	}

	@Override
	public UserDTO getById(Long id) throws UserNotFoundException {
		User u = repo.findById(id);
		if(u==null) {
			throw new UserNotFoundException("user not found with id : " + id);
		}
		return toDTO(u);
	}

	@Override
	public List<UserDTO> getAll() {
		return repo.findAll().stream().map(this::toDTO).collect(Collectors.toList());
	}

	@Override
	public UserDTO update(UserDTO dto) {
		repo.update(toEntity(dto));
		return dto;
	}

	@Override
	public boolean delete(Long id) {
		return repo.deleteById(id) == 1;
	}
}
