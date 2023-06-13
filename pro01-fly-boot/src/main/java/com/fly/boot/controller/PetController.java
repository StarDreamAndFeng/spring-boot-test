package com.fly.boot.controller;

import com.fly.boot.bean.Pet;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: fly
 * @Date: 2023-02-07 13:25
 * @Description:
 */
@RestController
@RequestMapping("/pet")
@Slf4j
public class PetController {

    private Pet pet;

    @Autowired
    public void setPet(Pet pet) {
        this.pet = pet;
    }

    @RequestMapping("/test")
    public Pet testCat() {
        log.info("已经访问 http://localhost:8923/pet/test");
        return pet;
    }
}
