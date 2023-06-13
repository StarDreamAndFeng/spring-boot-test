package com.fly.boot.controller;

import com.fly.boot.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Import;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: fly
 * @Date: 2023-02-07 10:13
 * @Description:
 */
@Import({User.class})
@RequestMapping("/user")
@RestController
public class UserController {

    private User user;

    @Autowired
    public void setUser(User user){
        this.user = user;
    }

    @RequestMapping("/{username}")
    public String testUser(@PathVariable String username) {
        return "用户名:" + username;
    }

    @RequestMapping("/testImport")
    public String testImport() {
        return user.toString();
    }
}
