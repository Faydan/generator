package com.generator.user.controller;

import com.generator.user.api.UserApi;
import com.generator.user.entity.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController implements UserApi {

    @Override
    public User getById(@PathVariable("id") Integer id) {
        return new User(id, "小明", "admin");
    }
}
