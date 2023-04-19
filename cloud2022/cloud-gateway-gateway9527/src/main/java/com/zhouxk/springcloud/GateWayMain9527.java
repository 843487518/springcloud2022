package com.zhouxk.springcloud;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @PACKAGE_NAME: com.zhouxk.springcloud
 * @NAME: GateWaymain9527
 * @USER: zhouxk
 * @DATE: 2023/4/18
 * @TIME: 22:14
 * @DAY_NAME_FULL: 星期二
 * @PROJECT_NAME: cloud2022
 * @DESCRIPTION: 启动类
 */

@SpringBootApplication
@EnableEurekaClient
@Slf4j
public class GateWayMain9527 {
    public static void main(String[] args) {
        SpringApplication.run(GateWayMain9527.class, args);
        log.info("项目启动:http://localhost:9527");
    }
}
