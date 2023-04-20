package com.zhouxk.springcloud;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @PACKAGE_NAME: com.zhouxk.springcloud
 * @NAME: ConfigClientMain3355
 * @USER: zhouxk
 * @DATE: 2023/4/19
 * @TIME: 20:10
 * @DAY_NAME_FULL: 星期三
 * @PROJECT_NAME: cloud2022
 * @DESCRIPTION: TODO
 */
@SpringBootApplication
@Slf4j
public class ConfigClientMain3366 {
    public static void main(String[] args) {
        SpringApplication.run(ConfigClientMain3366.class, args);
        log.info("配置中心模块启动:http://localhost:3366");

    }
}
