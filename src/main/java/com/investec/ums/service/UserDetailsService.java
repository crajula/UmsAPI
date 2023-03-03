package com.investec.ums.service;

import com.investec.ums.dto.UserDTO;
import com.investec.ums.dto.UserDetailsRequestDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserDetailsService {

    public UserDTO getUserById(int id);
    public List<UserDTO> getAllUsers();
    public void saveOrUpdate(UserDetailsRequestDTO user);
    public void deleteUserById(int id);
}