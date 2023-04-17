package com.zhouxk.springcloud.service;

import com.zhouxk.springcloud.service.impl.PaymentFallbackServiceImpl;
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
@FeignClient(value = "CLOUD-PROVIDER-HYSTRIX-PAYMENT", fallback = PaymentFallbackServiceImpl.class)
public interface PaymentHystrixService {
    @GetMapping("/payment/hystrix/ok/{id}")
    String paymentInfoOK(@PathVariable("id") Integer id);

    @GetMapping("/payment/hystrix/timeout/{id}")
    String paymentInfoTimeOut(@PathVariable("id") Integer id);
}
