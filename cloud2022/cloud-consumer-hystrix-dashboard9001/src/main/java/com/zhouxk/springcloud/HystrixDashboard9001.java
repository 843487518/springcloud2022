package com.zhouxk.springcloud;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @PACKAGE_NAME: com.zhouxk.springcloud
 * @NAME: HystrixDashboard9001
 * @USER: zhouxk
 * @DATE: 2023/4/18
 * @TIME: 15:06
 * @DAY_NAME_FULL: 星期二
 * @PROJECT_NAME: cloud2022
 * @DESCRIPTION: TODO
 */
@SpringBootApplication
@EnableHystrixDashboard
@Slf4j
public class HystrixDashboard9001 {
    public static void main(String[] args) {
        SpringApplication.run(HystrixDashboard9001.class, args);
        log.info("消费者订单模块启动:http://localhost:9001/hystrix");

    }
}
