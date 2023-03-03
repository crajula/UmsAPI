package com.investec.ums.controller;

import com.investec.ums.dto.UserDTO;
import com.investec.ums.dto.UserDetailsRequestDTO;
import com.investec.ums.dto.UserDetailsResponseDTO;
import com.investec.ums.service.UserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/ums")
public class UserManagementController {
   @Autowired
   UserDetailsService userDetailsService;

   @PostMapping("/create/user")
   public ResponseEntity<UserDetailsResponseDTO> addUser(@RequestBody UserDetailsRequestDTO requestDTO) {
      userDetailsService.saveOrUpdate(requestDTO);
      return new ResponseEntity<>(HttpStatus.CREATED);
   }

   @GetMapping("/users")
   public ResponseEntity<List<UserDTO>> getAllUsers(){
      return new ResponseEntity<>(userDetailsService.getAllUsers(),HttpStatus.OK);
   }

   @GetMapping("/user/{id}")
   public ResponseEntity<UserDTO> getUser(@PathVariable("id") int id) {
      return new ResponseEntity<>(userDetailsService.getUserById(id), HttpStatus.OK);
   }

   @DeleteMapping("/User/{id}")
   public ResponseEntity deleteUser(@PathVariable("id") int id) {
      userDetailsService.deleteUserById(id);
      return new ResponseEntity<>(HttpStatus.OK);
   }
}