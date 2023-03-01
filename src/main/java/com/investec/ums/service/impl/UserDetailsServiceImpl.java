package com.investec.ums.service.impl;

import com.investec.ums.dto.UserDetailsRequestDTO;
import com.investec.ums.repository.UserDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserDetailsServiceImpl {

   @Autowired
   UserDetailsRepository userRepository;
   public UserDetailsRequestDTO getEmployeeById(int id) {
      return null;
   }
   public List<UserDetailsRequestDTO> getAllEmployees(){
      return null;
   }
   public void saveOrUpdate(UserDetailsRequestDTO userDetailsRequestDTO) {
   }
   public void deleteUserById(int id) {
   }
}