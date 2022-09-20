package com.zhouxk.springcloud;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @BelongsProject: cloud2022
 * @BelongsPackage: com.zhouxk.springcloud
 * @Author: zhouxk
 * @CreateTime: 2022-09-20  20:47
 * @Description: TODO
 * @Version: 1.0
 */
@Slf4j
//该注解用于向使用consul或者zookeeper作为注册中心时注册服务
@EnableDiscoveryClient
@SpringBootApplication
public class PaymentMain8005 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8005.class, args);
        log.info("项目启动:http://localhost:8005");
    }
}
