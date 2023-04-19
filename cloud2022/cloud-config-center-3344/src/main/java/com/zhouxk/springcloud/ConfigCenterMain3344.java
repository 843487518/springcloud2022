package com.zhouxk.springcloud;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @PACKAGE_NAME: com.zhouxk.springcloud
 * @NAME: ConfigCenterMain3344
 * @USER: zhouxk
 * @DATE: 2023/4/19
 * @TIME: 17:35
 * @DAY_NAME_FULL: 星期三
 * @PROJECT_NAME: cloud2022
 * @DESCRIPTION: 启动类
 */
@SpringBootApplication
@EnableConfigServer
@Slf4j
public class ConfigCenterMain3344 {

    public static void main(String[] args) {
        SpringApplication.run(ConfigCenterMain3344.class, args);
        log.info("配置中心模块启动:http://localhost:3344");

    }
}
