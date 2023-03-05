package com.investec.ums.service.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.investec.ums.dto.AddressDTO;
import com.investec.ums.dto.UserDTO;
import com.investec.ums.entity.Address;
import com.investec.ums.entity.User;
import com.investec.ums.repository.UserDetailsRepository;

public class UserDetailsServiceImplTest {

	@InjectMocks
	UserDetailsServiceImpl userServiceImpl;

	@Mock
	UserDetailsRepository userDetailsRepository;

	@Before
	public void init() {
		MockitoAnnotations.openMocks(this);
	}

	@Test
	public void getAllUsersTest() {
		List<User> userListDTO = new ArrayList<User>();
		List<Address> addressListDTO = new ArrayList<Address>();

		User usrOne = new User(1, "John", "John", "740681215", "8208046440359", addressListDTO);
		User empTwo = new User(2, "Vikky", "Raja", "740681214", "8208046440369", addressListDTO);
		User empThree = new User(3, "Chiru", "Raju", "740681216", "8208046440389", addressListDTO);

		userListDTO.add(usrOne);
		userListDTO.add(empTwo);
		userListDTO.add(empThree);

		Address addressDTO = new Address(1, "6-34", "Polofields", "Riverview street", "Johannesburg", "Gauteng", "SA",
				"2193", "test", usrOne);
		addressListDTO.add(addressDTO);

		when(userDetailsRepository.findAll()).thenReturn(userListDTO);
		List<User> empList = (List<User>) userServiceImpl.findAllUsers();
		assertEquals(3, empList.size());
	}

	@Test
	public void createUserTest() {
		List<AddressDTO> addressListDTO = new ArrayList<AddressDTO>();
		UserDTO usrOne = new UserDTO(1, "John", "John", "740681214", "8208046440389", addressListDTO);
		AddressDTO addressDTO = new AddressDTO(1, "houseNo", "streeName", "area", "city", "state", "country", "pinCode",
				"test", usrOne);
		addressListDTO.add(addressDTO);

		List<Address> addressList = new ArrayList<Address>();
		User usr = new User(1, "John", "John", "98989898", "2323232323232", addressList);
		when(userDetailsRepository.save(usr)).thenReturn(usr);
		User user = userServiceImpl.createUser(usrOne);
		assertEquals("John", user.getFirstName());
	}

	@Test
	public void searchUserTest() {

		List<AddressDTO> addressListDTO = new ArrayList<AddressDTO>();
		UserDTO usrOne = new UserDTO(1, "John", "John", "740681214", "8208046440389", addressListDTO);
		AddressDTO addressDTO = new AddressDTO(1, "houseNo", "streeName", "area", "city", "state", "country", "pinCode",
				"test", usrOne);
		addressListDTO.add(addressDTO);

		List<Address> addressList = new ArrayList<Address>();
		Optional<User> usr = Optional.ofNullable(new User(1, "John", "John", "98989898", "8208046440389", addressList));

		when(userDetailsRepository.findByFirstNameOrIdNumberOrMobileNumber(usr.get().getFirstName(),
				usr.get().getIdNumber(), usr.get().getMobileNumber())).thenReturn(usr);
		Optional<User> user = userServiceImpl.searchUser(usrOne);

		assertEquals("John", user.get().getFirstName());
	}

}