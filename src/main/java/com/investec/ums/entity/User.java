package com.investec.ums.entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="user_details")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class User {
   @Id
   @Column(name="user_id")
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private int id;
   @Column(name="first_name")
   private String firstName;
   @Column(name="last_name")
   private String lastName;
   @Column(name="mobile_number")
   private String mobileNumber;
   @Column(name="id_number")
   private int idNumber;   
	
}