package com.zhouxk.springcloud;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @BelongsProject: cloud2022
 * @BelongsPackage: com.zhouxk.springcloud
 * @Author: zhouxk
 * @CreateTime: 2022-09-19  22:47
 * @Description: springboot启动类
 * @Version: 1.0
 */
@Slf4j
//该注解用于向使用consul或者zookeeper作为注册中心时注册服务
@EnableDiscoveryClient
@SpringBootApplication
public class PaymentMain8004 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8004.class, args);
        log.info("项目启动:http://localhost:8004");
    }
}
