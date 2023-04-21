package com.zhouxk.springcloud;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @PACKAGE_NAME: com.zhouxk.springcloud
 * @NAME: ConfigNacosMain3377
 * @USER: zhouxk
 * @DATE: 2023/4/21
 * @TIME: 15:57
 * @DAY_NAME_FULL: 星期五
 * @PROJECT_NAME: cloud2022
 * @DESCRIPTION: TODO
 */
@SpringBootApplication
@EnableDiscoveryClient
@Slf4j
public class ConfigNacosMain3377 {

    public static void main(String[] args) {
        SpringApplication.run(ConfigNacosMain3377.class,args);
        log.info("模块启动:http://localhost:3377");
    }
}
