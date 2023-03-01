package com.investec.ums.repository;
import com.investec.ums.entity.UserDetailsEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface UserDetailsRepository extends CrudRepository<UserDetailsEntity, Integer>  {
}