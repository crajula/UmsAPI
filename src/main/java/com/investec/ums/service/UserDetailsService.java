package com.investec.ums.service;

import com.investec.ums.dto.UserDetailsRequestDTO;
import com.investec.ums.dto.UserDetailsResponseDTO;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserDetailsService {

    public UserDetailsResponseDTO getUserById(int id) {
        return null;
    }

    public List<UserDetailsRequestDTO> getAllUsers() {
        return null;
    }

    public void saveOrUpdate(UserDetailsRequestDTO userDetailsRequestDTO) {
    }

    public void deleteUserById(int id) {
    }
}