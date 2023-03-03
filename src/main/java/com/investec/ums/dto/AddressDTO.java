package com.investec.ums.dto;
import com.investec.ums.entity.User;
import lombok.*;

import javax.persistence.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AddressDTO {
   private int id;
   private String houseNo;
   private String buildingName;
   private String streetName;
   private String areaName;
   private String city;
   private String state;
   private String country;
   private String pin;
   private UserDTO user;
}