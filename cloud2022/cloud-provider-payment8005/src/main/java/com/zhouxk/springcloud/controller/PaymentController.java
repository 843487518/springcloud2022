package com.zhouxk.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @BelongsProject: cloud2022
 * @BelongsPackage: com.zhouxk.springcloud.controller
 * @Author: zhouxk
 * @CreateTime: 2022-09-20  20:48
 * @Description: 支付模块控制器
 * @Version: 1.0
 */
@RestController
//@Slf4j
public class PaymentController {
    @Value("${server.port}")
    private String serverPort;

    @RequestMapping(value = "/payment/zk")
    public String paymentzk() {
        return "springcloud with zookeeper: " + serverPort + "\t" + UUID.randomUUID().toString();
    }
}
