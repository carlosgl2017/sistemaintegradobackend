package com.sistemas.integradobackend.postgres.services;

import com.sistemas.integradobackend.postgres.entities.User;
import com.sistemas.integradobackend.postgres.repositories.UserRepository;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{

    private UserRepository repository;

    public UserServiceImpl(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<User> findAll() {
        return (List)this.repository.findAll(); //(cast) conversion
    }
    @Transactional(readOnly = true)
    @Override
    public Optional<User> findById(@NonNull Long id) {
        return repository.findById(id);
    }
    @Transactional
    @Override
    public User save(User user) {
        return repository.save(user);
    }
    @Transactional
    @Override
    public void deleteById(Long id) {
    repository.deleteById(id);
    }
}
