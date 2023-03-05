package com.investec.ums.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@Builder
public class AddressDTO {

	private int id;
	private String houseNo;
	private String buildingName;
	private String streeName;
	private String area;
	private String city;
	private String state;
	private String country;
	private String pinCode;
	private UserDTO user;

}