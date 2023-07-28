package com.zhouxk.springcloud.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zhouxk.springcloud.entity.Users;
import org.springframework.stereotype.Repository;

/**
 * @PACKAGE_NAME: com.zhouxk.springcloud.mapper
 * @NAME: UserMapper
 * @USER: zhouxk
 * @DATE: 2023/6/4
 * @TIME: 16:08
 * @DAY_NAME_FULL: 星期日
 * @PROJECT_NAME: cloud2022
 * @DESCRIPTION: TODO
 */
@Repository
public interface UserMapper extends BaseMapper<Users> {
}
