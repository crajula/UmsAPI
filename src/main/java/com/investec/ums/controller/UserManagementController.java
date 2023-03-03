package com.investec.ums.controller;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.investec.ums.dto.UserDetailsDTO;
import com.investec.ums.dto.UserDetailsRequestDTO;
import com.investec.ums.service.UserDetailsService;




@RestController
@RequestMapping(path = "/ums")
public class UserManagementController {
   
   @Autowired
   private UserDetailsService userDetailsService;
   
   @GetMapping("/users")
   public List<UserDetailsDTO> getAllUsers(){
      return null;
   }
   
   @GetMapping("/user/{id}")
   public UserDetailsDTO getUser(@PathVariable("id") int id) {
      return null;
   }
   
   @DeleteMapping("/user/{id}")
   public void deleteUser(@PathVariable("id") int id) {
   }
   
   @PostMapping("/add/user")
   public void addUser(@RequestBody @Valid UserDetailsRequestDTO userDetailsRequestDTO) {
	   
   }
 
}