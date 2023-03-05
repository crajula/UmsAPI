package com.investec.ums.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@Builder
public class UserDTO {

	private int id;

	@NotBlank(message = "Firstname is mandatory.")
	private String firstName;

	@NotBlank(message = "Lastname is mandatory.")
	private String lastName;

	private String mobileNumber;

	@NotBlank(message = "ID is mandatory.")
	@Pattern(regexp = "(^$|[0-9]{13})", message = "Invalid ID number")
	private String idNumber;
	private List<AddressDTO> address;

}