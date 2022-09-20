package com.zhouxk.springcloud;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @BelongsProject: cloud2022
 * @BelongsPackage: com.zhouxk.springcloud
 * @Author: zhouxk
 * @CreateTime: 2022-09-20  20:16
 * @Description: 消费者订单模块启动类
 * @Version: 1.0
 */
@Slf4j
@EnableDiscoveryClient
@SpringBootApplication
public class OrderZKMain82 {
    public static void main(String[] args) {
        SpringApplication.run(OrderZKMain82.class, args);
        log.info("消费者订单模块启动:http://localhost:82");
    }
}
