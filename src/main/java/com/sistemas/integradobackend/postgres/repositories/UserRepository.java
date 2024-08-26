package com.sistemas.integradobackend.postgres.repositories;

import com.sistemas.integradobackend.postgres.entities.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<User,Long> {

    Optional<User> findByUsername(String name);
}
