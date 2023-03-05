package com.investec.ums.repository;

import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.investec.ums.entity.User;


@Repository
public interface UserDetailsRepository extends CrudRepository<User, Integer> {

	Optional<User> findByIdNumberOrMobileNumber(String idNumber, String mobileNumber);

	Optional<User> findByFirstNameOrIdNumberOrMobileNumber(String firstName, String idNumber, String mobileNumber);

	User findByIdNumber(String idNumber);

	User findByMobileNumber(String mobileNumber);
}