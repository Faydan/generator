package com.generator.user.api;

import com.generator.user.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/user")
public interface UserApi {

    @GetMapping("/{id}")
    User getById(@PathVariable("id") Integer id);
}
