package com.zhouxk.springcloud;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @PACKAGE_NAME: com.zhouxk.springcloud
 * @NAME: OrderHystrixMain81
 * @USER: zhouxk
 * @DATE: 2023/4/17
 * @TIME: 9:59
 * @DAY_NAME_FULL: 星期一
 * @PROJECT_NAME: cloud2022
 * @DESCRIPTION: 启动类
 */
@SpringBootApplication
@EnableFeignClients // 启动 feign
@Slf4j
@EnableHystrix
public class OrderHystrixMain81 {

    public static void main(String[] args) {
        SpringApplication.run(OrderHystrixMain81.class, args);
        log.info("消费者订单模块启动:http://localhost:81");

    }
}
