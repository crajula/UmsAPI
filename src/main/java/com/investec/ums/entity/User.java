package com.investec.ums.entity;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="user")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {

   @Id
   @Column(name="user_id")
   @GeneratedValue(strategy = GenerationType.AUTO)
   private int id;

   @Column(name="first_name")
   private String firstName;

   @Column(name="last_name")
   private String lastName;

   @Column(name="mobile_number")
   private String mobileNumber;

   @Column(name="id_number")
   private int idNumber;

   @OneToMany(mappedBy = "user")
   private List<Address> address= new ArrayList<>();
}