package com.fly.boot.bean;

/**
 * @author: fly
 * @Date: 2023-02-07 17:39
 * @Description:
 */

import lombok.*;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "pet")
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class Pet {
    private String name;
    private Double weight;
}
