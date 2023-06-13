package com.fly.boot.bean;

import lombok.*;

/**
 * @author: fly
 * @Date: 2023-02-08 16:25
 * @Description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class User {
    private int id;
    private String name;
    private int age;

    public String toString() {
        return "{id:" + id + ",name:\"" + name + "\",age: " + 19 + "}";
    }
}
