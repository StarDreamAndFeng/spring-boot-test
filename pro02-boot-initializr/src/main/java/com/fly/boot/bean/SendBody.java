package com.fly.boot.bean;

import lombok.*;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author: fly
 * @Date: 2023-02-07 20:48
 * @Description: 发送主体 【最外层区域】
 */
@Component
@ConfigurationProperties(prefix = "send.body")
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class SendBody {
    private Boolean status;
    private String massage;
    private String code;
    private List<Pet> data;
}
