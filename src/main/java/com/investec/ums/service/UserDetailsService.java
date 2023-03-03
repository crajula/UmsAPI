package com.investec.ums.service;

import com.investec.ums.dto.UserDetailsDTO;

import java.util.List;

public interface UserDetailsService {

    public UserDetailsDTO getUserById(int id);

    public List<UserDetailsDTO> getAllUsers();

    public void saveOrUpdate(UserDetailsDTO userDetailsRequestDTO);
    
    public void deleteUserById(int id);
}