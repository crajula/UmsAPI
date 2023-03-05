package com.investec.ums.controller;
import com.investec.ums.dto.UserDTO;
import com.investec.ums.service.UserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping(path = "/user")
public class UserManagementController {
   
   @Autowired
   private UserDetailsService userService;  
      
   @PostMapping("/create")
   public ResponseEntity<Object> createUser(@RequestBody @Valid UserDTO userDTO) {
		   return new ResponseEntity<>(userService.createUser(userDTO),HttpStatus.CREATED);
   }
 
   @PostMapping("/update")
   public ResponseEntity<Object> updateUser(@RequestBody @Valid UserDTO userDTO) {
		   return new ResponseEntity<>(userService.updateUser(userDTO),HttpStatus.OK);
   }   

   @PostMapping("/search")
   public ResponseEntity<Object> searchUser(@RequestBody @Valid UserDTO userDTO) {
		   return new ResponseEntity<>(userService.updateUser(userDTO),HttpStatus.OK);
   }
   
   @GetMapping("/all")
   public ResponseEntity<Object> findAllUsers() {
		   return new ResponseEntity<>(userService.findAllUsers(),HttpStatus.OK);
   }
}