package io.github.sidneyrdm.api.restful.com.java.service;

import io.github.sidneyrdm.api.restful.com.java.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}