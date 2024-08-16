package com.sistemas.integradobackend.postgres.repositories;

import com.sistemas.integradobackend.postgres.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Long> {

}
