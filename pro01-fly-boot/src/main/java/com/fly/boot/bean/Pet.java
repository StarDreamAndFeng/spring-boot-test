package com.fly.boot.bean;

import lombok.*;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author: fly
 * @Date: 2023-02-07 9:04
 * @Description:
 */
@Component
@ConfigurationProperties(prefix = "cat")
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class Pet {
    private int age;
    private String name;

}
