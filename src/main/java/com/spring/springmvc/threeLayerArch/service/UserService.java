package com.spring.springmvc.threeLayerArch.service;

import java.util.List;

import com.spring.springmvc.threeLayerArch.dto.UserDTO;

public interface UserService {
	UserDTO create(UserDTO dto);

	UserDTO update(UserDTO dto);

	boolean delete(Long id);

	UserDTO getById(Long id);

	List<UserDTO> getAll();
}
