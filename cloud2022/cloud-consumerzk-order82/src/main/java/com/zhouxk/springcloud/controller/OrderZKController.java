package com.zhouxk.springcloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @BelongsProject: cloud2022
 * @BelongsPackage: com.zhouxk.springcloud.controller
 * @Author: zhouxk
 * @CreateTime: 2022-09-20  20:25
 * @Description: TODO
 * @Version: 1.0
 */
@RestController
@RequestMapping("consumer")
public class OrderZKController {

    // zookeeper服务中心的服务名称
    public static final String INVOKE_URL = "http://cloud-provider-payment";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping(value = "/payment/zk")
    public String paymentInfo() {
        String result = restTemplate.getForObject(INVOKE_URL + "/payment/zk", String.class);
        return result;
    }
}

