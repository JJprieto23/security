package com.security.security.persistence.repository;

import com.security.security.persistence.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository  extends CrudRepository<UserEntity, Integer> {
    Optional<UserEntity> FindUserEntityByUsername(String username);
}
