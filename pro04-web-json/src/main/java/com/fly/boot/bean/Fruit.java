package com.fly.boot.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * @author: fly
 * @Date: 2023-02-13 10:38
 * @Description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Fruit {
    private int id;
    // 商品名称
    private String name;
    // 商品图片地址
    private String picUrl;
    // 商品勾选状态
    private Boolean state;
    // 商品勾选数量
    private int count;
    // 商品价格
    private Double price;
}
