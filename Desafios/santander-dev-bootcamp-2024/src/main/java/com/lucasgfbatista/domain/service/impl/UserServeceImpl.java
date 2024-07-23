package com.lucasgfbatista.domain.service.impl;

import com.lucasgfbatista.domain.model.User;
import com.lucasgfbatista.domain.repository.UserRepository;
import com.lucasgfbatista.domain.service.UserService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class UserServeceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServeceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id)
                .orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(User userToCreate) {
        if (userRepository.existsByAccountNumber(userToCreate.getAccount().getNumber())) {
            throw new IllegalArgumentException("This account number already exists");
        }

        return userRepository.save(userToCreate);
    }
}
