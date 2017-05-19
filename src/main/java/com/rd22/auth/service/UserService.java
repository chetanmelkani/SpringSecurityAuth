package com.rd22.auth.service;

import com.rd22.auth.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
