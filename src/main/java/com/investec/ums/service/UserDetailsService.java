package com.investec.ums.service;

import java.util.Optional;
import com.investec.ums.dto.UserDTO;
import com.investec.ums.entity.User;

public interface UserDetailsService {

	public User createUser(UserDTO userDTO);

	public User updateUser(UserDTO userDTO);

	Optional<User> searchUser(UserDTO dto);

	public Iterable<User> findAllUsers();
}