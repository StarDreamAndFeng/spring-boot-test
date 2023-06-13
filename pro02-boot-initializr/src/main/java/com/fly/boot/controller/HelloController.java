package com.fly.boot.controller;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fly.boot.bean.Person;
import com.fly.boot.bean.SendBody;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: fly
 * @Date: 2023-02-07 17:34
 * @Description:
 */

@Slf4j
@RestController
public class HelloController {

    private Person person;
    private SendBody sendBody;

    @Autowired
    public void setPerson(Person person) {
        this.person = person;
    }

    @Autowired
    public void setSendBody(SendBody sendBody) {
        this.sendBody = sendBody;
    }

    @RequestMapping("/")
    public String hello() {
        return "Hello World!";
    }

    @RequestMapping("/person")
    public Person testPerson() {
        return person;
    }

    @RequestMapping("/send/body")
    public SendBody sendBody() {
        return sendBody;
    }
}
