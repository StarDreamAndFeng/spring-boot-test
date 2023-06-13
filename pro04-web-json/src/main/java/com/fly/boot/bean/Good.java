package com.fly.boot.bean;

import lombok.*;

import java.util.List;

/**
 * @author: fly
 * @Date: 2023-02-13 20:38
 * @Description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class Good {
    // 商品 id
    private int id;
    // 商品 名称
    private String name;
    // 价格
    private int price;
    // 标签
    private List<String> tags;
    // 文本框是否显示
    private Boolean inputVisible;
    // 文本框内容
    private String inputValue;
}
