package com.investec.ums.dto;
import com.investec.ums.entity.Address;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDTO {
   private int id;
   private String firstName;
   private String lastName;
   private String mobileNumber;
   private int idNumber;
   private List<AddressDTO> address;
}