package com.lucasgfbatista.domain.service;

import com.lucasgfbatista.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);

}
