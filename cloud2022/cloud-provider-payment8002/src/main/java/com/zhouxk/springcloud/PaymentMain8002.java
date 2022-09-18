package com.zhouxk.springcloud;

import jdk.nashorn.internal.runtime.logging.Logger;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @BelongsProject: cloud2022
 * @BelongsPackage: com.zhouxk.springcloud
 * @Author: zhouxk
 * @CreateTime: 2022-09-16  21:47
 * @Description: springboot启动类
 * @Version: 1.0
 */
@Slf4j
@EnableEurekaClient
@SpringBootApplication
public class PaymentMain8002 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8002.class, args);
        log.info("项目启动:http://localhost:8002");
    }
}
