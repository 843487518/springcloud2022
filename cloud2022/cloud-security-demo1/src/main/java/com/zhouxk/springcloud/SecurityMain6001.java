package com.zhouxk.springcloud;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * @PACKAGE_NAME: com.zhouxk.springcloud
 * @NAME: SecurityMain6001
 * @USER: zhouxk
 * @DATE: 2023/6/4
 * @TIME: 14:18
 * @DAY_NAME_FULL: 星期日
 * @PROJECT_NAME: cloud2022
 * @DESCRIPTION: TODO
 */
@Slf4j
@SpringBootApplication
@MapperScan("com.zhouxk.springcloud.mapper")
public class SecurityMain6001 {

    public static void main(String[] args) {
        SpringApplication.run(SecurityMain6001.class, args);
        log.info("项目启动:http://localhost:6001");
    }
}
