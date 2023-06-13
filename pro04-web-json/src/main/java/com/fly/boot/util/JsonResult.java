package com.fly.boot.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author: fly
 * @Date: 2023-02-08 16:22
 * @Description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class JsonResult<T> {
    private T data;
    private String message;
    private String code;
}
