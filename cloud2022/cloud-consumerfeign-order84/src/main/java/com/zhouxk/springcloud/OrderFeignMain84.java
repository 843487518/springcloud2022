package com.zhouxk.springcloud;

import com.zhouxk.myrule.MyselfRule;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @BelongsProject: cloud2022
 * @BelongsPackage: com.zhouxk.springcloud
 * @Author: zhouxk
 * @CreateTime: 2022-09-29  22:51
 * @Description: 消费者订单模块启动类
 * @Version: 1.0
 */
@Slf4j
@SpringBootApplication
@EnableFeignClients // 启动feign
@RibbonClient(name = "CLOUD-PAYMENT-SERVICE", configuration = MyselfRule.class) // 启动该服务时去加载自定义的ribbon配置
public class   OrderFeignMain84 {
    public static void main(String[] args) {
        SpringApplication.run(OrderFeignMain84.class, args);
        log.info("消费者订单模块启动:http://localhost:80");
    }
}
