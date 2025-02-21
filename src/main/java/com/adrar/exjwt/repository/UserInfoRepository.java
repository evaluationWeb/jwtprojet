package com.adrar.exjwt.repository;

import com.adrar.exjwt.model.UserInfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserInfoRepository extends CrudRepository<UserInfo, Long> {
    Optional<UserInfo> findByEmail(String email);
}
