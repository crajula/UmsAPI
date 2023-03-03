package com.investec.ums.service.impl;

import com.investec.ums.dto.UserDTO;
import com.investec.ums.dto.UserDetailsRequestDTO;
import com.investec.ums.entity.User;
import com.investec.ums.repository.UserDetailsRepository;
import com.investec.ums.service.UserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import static mapper.MapperUtil.*;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

   @Autowired
   UserDetailsRepository userRepository;

   @Override
   public UserDTO getUserById(int id) {
      Optional<User> user = userRepository.findById(id);
      return buildUserDTO(user.get());
   }

   @Override
   public List<UserDTO> getAllUsers() {
      List<User> users = (List<User>) userRepository.findAll();
      return buildUsersDTO(users);
   }

   @Override
   public void saveOrUpdate(UserDetailsRequestDTO requestDTO) {
      User user = buildUser(requestDTO);
      userRepository.save(user);
   }

   @Override
   public void deleteUserById(int id) {
      userRepository.deleteById(id);
   }
}