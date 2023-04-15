package com.zhouxk.springcloud;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @PACKAGE_NAME: com.zhouxk.springcloud
 * @NAME: OrderHystrixMain80
 * @USER: zhouxk
 * @DATE: 2023/4/14
 * @TIME: 12:01
 * @DAY_NAME_FULL: 星期五
 * @PROJECT_NAME: cloud2022
 * @DESCRIPTION: 启动类
 */

@Slf4j
@SpringBootApplication
@EnableFeignClients // 启动 feign
//@RibbonClient(name = "CLOUD-PAYMENT-SERVICE")
//@EnableHystrix // 启动 hystrix
public class OrderHystrixMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderHystrixMain80.class, args);
        log.info("消费者订单模块启动:http://localhost:80");
    }
}
