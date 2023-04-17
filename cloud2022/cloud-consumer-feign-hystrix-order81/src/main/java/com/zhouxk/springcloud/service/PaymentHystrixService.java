package com.zhouxk.springcloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @PACKAGE_NAME: com.zhouxk.springcloud.service
 * @NAME: PaymentHystrixService
 * @USER: zhouxk
 * @DATE: 2023/4/17
 * @TIME: 10:02
 * @DAY_NAME_FULL: 星期一
 * @PROJECT_NAME: cloud2022
 * @DESCRIPTION: TODO
 */
@Component
@FeignClient(value = "CLOUD-PROVIDER-HYSTRIX-PAYMENT")
public interface PaymentHystrixService {
    @GetMapping("/payment/hystrix/ok/{id}")
    String paymentInfoOK(@PathVariable("id") Integer id);

    @GetMapping("/payment/hystrix/timeout/{id}")
    String paymentInfoTimeOut(@PathVariable("id") Integer id);
}
