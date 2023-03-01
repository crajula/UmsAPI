package com.investec.ums.entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_details")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class UserDetailsEntity {
   @Id
   @Column
   private int id;
   @Column
   private String name;
   @Column
   private int age;
   @Column
   private String email;

}