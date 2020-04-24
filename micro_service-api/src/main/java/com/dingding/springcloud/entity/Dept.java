package com.dingding.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author liudingding
 * @ClassName Dept
 * @description
 * @date 2020/1/21 22:20
 * Version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Dept {
    private Integer id;
    private String name;
    private String source;
}
