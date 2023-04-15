package com.zhouxk.springcloud;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @PACKAGE_NAME: com.zhouxk.springcloud
 * @NAME: PaymentHystrixMain8001
 * @USER: zhouxk
 * @DATE: 2023/4/14
 * @TIME: 9:48
 * @DAY_NAME_FULL: 星期五
 * @PROJECT_NAME: cloud2022
 * @DESCRIPTION: TODO
 */

@Slf4j
@SpringBootApplication
@EnableEurekaClient
//注解开启断路器功能
@EnableCircuitBreaker

public class PaymentHystrixMain8001 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentHystrixMain8001.class, args);
        log.info("项目启动:http://localhost:8001");
    }
}
