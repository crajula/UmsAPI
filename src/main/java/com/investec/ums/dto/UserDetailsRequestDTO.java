package com.investec.ums.dto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Setter
@Getter
@AllArgsConstructor
public class UserDetailsRequestDTO {

   @NotBlank(message = "Firstname is mandatory.")
   private String firstName;
   
   @NotBlank(message = "Lastname is mandatory.")
   private String lastName;
   
   private String mobileNumber;
   
   @NotBlank(message = "ID is mandatory.")
   @Size(min = 13, message = "ID should have at least 13 numbers")
   private String idNumber;
   
   private AddressDTO address;
}