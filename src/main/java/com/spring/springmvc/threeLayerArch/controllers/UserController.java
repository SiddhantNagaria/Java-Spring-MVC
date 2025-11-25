package com.spring.springmvc.threeLayerArch.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.spring.springmvc.threeLayerArch.dto.UserDTO;
import com.spring.springmvc.threeLayerArch.service.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {

	@Autowired
	private UserService service;

	@PostMapping
	public UserDTO create(@RequestBody UserDTO dto) {
		return service.create(dto);
	}

	@GetMapping
	public List<UserDTO> all() {
		return service.getAll();
	}

	@GetMapping("/{id}")
	public UserDTO get(@PathVariable Long id) {
		return service.getById(id);
	}

	@PutMapping("/{id}")
	public UserDTO update(@PathVariable Long id, @RequestBody UserDTO dto) {
		dto.setId(id);
		return service.update(dto);
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		service.delete(id);
	}
}
