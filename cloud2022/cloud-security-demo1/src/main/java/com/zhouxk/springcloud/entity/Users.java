package com.zhouxk.springcloud.entity;

import lombok.Data;

/**
 * @PACKAGE_NAME: com.zhouxk.springcloud.entity
 * @NAME: Users
 * @USER: zhouxk
 * @DATE: 2023/6/4
 * @TIME: 16:06
 * @DAY_NAME_FULL: 星期日
 * @PROJECT_NAME: cloud2022
 * @DESCRIPTION: TODO
 */
@Data
public class Users {
    private Integer id;
    private String userName;
    private String password;
}
