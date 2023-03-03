
  package com.investec.ums.entity; import lombok.AllArgsConstructor; import
  lombok.Getter; import lombok.NoArgsConstructor; import lombok.Setter;
  
  import javax.persistence.Column; import javax.persistence.Entity; import
  javax.persistence.FetchType; import javax.persistence.GeneratedValue; import
  javax.persistence.GenerationType; import javax.persistence.Id; import
  javax.persistence.JoinColumn; import javax.persistence.ManyToOne; import
  javax.persistence.Table;
  
  import org.hibernate.annotations.OnDelete; import
  org.hibernate.annotations.OnDeleteAction;
  
  @Entity
  
  @Table(name="address")
  
  @Setter
  
  @Getter
  
  @AllArgsConstructor
  
  @NoArgsConstructor public class Address {
  
  @Id
  
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  
  @Column(name="ADDR_ID") private int addressId;
  
  @Column(name="HNO") private String houseNo;
  
  @Column(name="BUILDING_NAME") private String buldingName;
  
  @Column(name="STREE_NAME") private String streeName;
  
  @Column(name="AREA") private String area;
  
  @Column(name="CITY") private String city;
  
  @Column(name="STATE") private String state;
  
  @Column(name="country") private String country;
  
  @Column(name="PIN") private int pinCode;
  
  @ManyToOne(fetch = FetchType.LAZY, optional = false)
  
  @JoinColumn(name = "USER_ID", nullable = false)
  
  @OnDelete(action = OnDeleteAction.CASCADE) private User user;
  
  }
 