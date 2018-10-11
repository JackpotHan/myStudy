package com.jackpotHan.poiTest;

import lombok.*;

import java.util.Date;

/**
 * @Author: hanjt
 * @Date: 2018/10/9 10:53
 * @Description:
 */
@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private String studentNo;
    private String name;
    private String grade;
    private Integer age;
    /**0-男   1-女**/
    private Integer sex;
    private Double sorce;
    private Date gmtCreate;

}