package com.investec.ums.dto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Setter
@Getter
@AllArgsConstructor
public class UserDetailsRequestDTO {

   private int id;
   private String name;
   private int age;
   private String email;

}