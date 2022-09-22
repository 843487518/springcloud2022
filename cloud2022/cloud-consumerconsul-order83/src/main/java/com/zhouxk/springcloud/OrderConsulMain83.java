package com.zhouxk.springcloud;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @BelongsProject: cloud2022
 * @BelongsPackage: com.zhouxk.springcloud
 * @Author: zhouxk
 * @CreateTime: 2022-09-22  22:06
 * @Description: 消费者订单模块启动类
 * @Version: 1.0
 */

@Slf4j
@EnableDiscoveryClient
@SpringBootApplication
public class OrderConsulMain83 {
    public static void main(String[] args) {
        SpringApplication.run(OrderConsulMain83.class, args);
        log.info("消费者订单模块启动:http://localhost:83");
    }
}