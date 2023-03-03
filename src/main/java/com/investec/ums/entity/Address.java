package com.investec.ums.entity;
import lombok.*;

import javax.persistence.*;

@Entity
@Table(name="address")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Address {
   @Id
   @Column(name = "address_id")
   @GeneratedValue(strategy = GenerationType.AUTO)
   private int id;

   @Column(name="house_no")
   private String houseNo;

   @Column(name="building_name")
   private String buildingName;

   @Column(name="street_name")
   private String streetName;

   @Column(name="area_name")
   private String areaName;

   @Column(name="city")
   private String city;

   @Column(name="state")
   private String state;

   @Column(name="country")
   private String country;

   @Column(name="pin")
   private String pin;

   @ManyToOne
   @JoinColumn(name = "user_id", nullable = false)
   private User user;
}