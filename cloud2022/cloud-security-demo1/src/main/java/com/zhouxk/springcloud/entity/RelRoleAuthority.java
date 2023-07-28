package com.zhouxk.springcloud.entity;

import lombok.Data;

/**
 * @PACKAGE_NAME: com.zhouxk.springcloud.entity
 * @NAME: RelRoleAuthority
 * @USER: zhouxk
 * @DATE: 2023/6/4
 * @TIME: 21:45
 * @DAY_NAME_FULL: 星期日
 * @PROJECT_NAME: cloud2022
 * @DESCRIPTION: TODO
 */
@Data
public class RelRoleAuthority {
    private Integer id;
    private Integer roleId;
    private Integer authorityId;
}
