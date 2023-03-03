package com.investec.ums.dto;
import com.investec.ums.entity.Address;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@Builder
public class UserDetailsRequestDTO {

   @NotBlank(message = "Firstname is mandatory.")
   private String firstName;

   @NotBlank(message = "Lastname is mandatory.")
   private String lastName;

   private String mobileNumber;

   @NotBlank(message = "ID number is mandatory.")
   @Size(min = 13, message = "Please enter valid ID number.")
   private int idNumber;

   private List<AddressDTO> address;
}