package com.cjw.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 西楚霸王
 * @date 2020/12/7 15:02
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    private Integer code;
    private String message;
    private T  data;

    public CommonResult(Integer code,String message){
        this(code,message,null);
    }
}
