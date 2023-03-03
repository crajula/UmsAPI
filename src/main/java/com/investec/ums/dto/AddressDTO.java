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
public class AddressDTO {

   private String houseNo;
   private String buldingName;
   private String streeName;
   private String area;
   private String city;
   private String state;
   private String country;
   private int pinCode;

}