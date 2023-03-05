package com.investec.ums.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.investec.ums.dto.AddressDTO;
import com.investec.ums.dto.UserDTO;
import com.investec.ums.entity.Address;
import com.investec.ums.entity.User;
import com.investec.ums.exception.UserPresentExcetption;
import com.investec.ums.repository.UserDetailsRepository;
import com.investec.ums.service.UserDetailsService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
@Transactional
public class UserDetailsServiceImpl implements UserDetailsService {

	private UserDetailsRepository userRepository;

	@Override
	public Optional<User> searchUser(UserDTO userDTO) {
		return userRepository.findByFirstNameOrIdNumberOrMobileNumber(userDTO.getFirstName(), userDTO.getIdNumber(),
				userDTO.getMobileNumber());
	}
	
	@Override
	public Iterable<User> findAllUsers() {
		return userRepository.findAll();
	}

	@Override
	public User createUser(UserDTO userDTO) {
		verifyUserExist(userDTO);
		User user = User.builder().build();
		BeanUtils.copyProperties(userDTO, user);
		user.setAddress(buildAddressList(userDTO.getAddress(), user));
		return userRepository.save(user);
	}

	@Override
	public User updateUser(UserDTO userDTO) {
		Optional<User> existUser = userRepository.findById(userDTO.getId());
		User user = existUser.get();
		BeanUtils.copyProperties(userDTO, user);
		user.setAddress(buildAddressList(userDTO.getAddress(), user));
		return userRepository.save(user);
	}

	private List<Address> buildAddressList(List<AddressDTO> dtos, User user) {

		List<Address> addressDTOList = new ArrayList<>();
		dtos.forEach(new java.util.function.Consumer<AddressDTO>() {
			@Override
			public void accept(AddressDTO t) {
				addressDTOList.add(buildAddress(t, user));
			}
		});
		return addressDTOList;
	}

	private Address buildAddress(AddressDTO val, User user) {
		Address address = Address.builder().build();
		BeanUtils.copyProperties(val, address);
		address.setUser(user);
		return address;
	}

	private boolean isValid(UserDTO val) {
		return Objects.nonNull(val) && Objects.nonNull(val.getIdNumber()) && Objects.nonNull(val.getMobileNumber());
	}

	private void verifyUserExist(UserDTO userDTO) {

		if (!isValid(userDTO)) {
			throw new UserPresentExcetption("Invalid data provided, Please provide valid ID, Mobilenumber.");
		}

		Optional<User> userExist = userRepository.findByIdNumberOrMobileNumber(userDTO.getIdNumber(),
				userDTO.getMobileNumber());

		if (Objects.nonNull(userExist) && userExist.isPresent()) {
			throw new UserPresentExcetption("User already exist with provided ID or Mobilenumber.");
		}
	}

}