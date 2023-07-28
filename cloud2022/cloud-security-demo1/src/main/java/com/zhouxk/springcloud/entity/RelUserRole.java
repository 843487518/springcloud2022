package com.zhouxk.springcloud.entity;

import lombok.Data;

/**
 * @PACKAGE_NAME: com.zhouxk.springcloud.entity
 * @NAME: RelUserRole
 * @USER: zhouxk
 * @DATE: 2023/6/4
 * @TIME: 21:43
 * @DAY_NAME_FULL: 星期日
 * @PROJECT_NAME: cloud2022
 * @DESCRIPTION: TODO
 */
@Data
public class RelUserRole {
    private Integer id;
    private Integer userId;
    private Integer roleId;
}
