package com.investec.ums.service.impl;

import com.investec.ums.dto.UserDetailsDTO;
import com.investec.ums.service.UserDetailsService;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	@Override
	public UserDetailsDTO getUserById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserDetailsDTO> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveOrUpdate(UserDetailsDTO userDetailsRequestDTO) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteUserById(int id) {
		// TODO Auto-generated method stub
		
	}

}