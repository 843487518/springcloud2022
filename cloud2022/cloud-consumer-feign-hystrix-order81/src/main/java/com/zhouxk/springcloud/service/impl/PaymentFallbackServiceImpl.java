package com.zhouxk.springcloud.service.impl;

import com.zhouxk.springcloud.service.PaymentHystrixService;
import org.springframework.stereotype.Component;

/**
 * @PACKAGE_NAME: com.zhouxk.springcloud.service.impl
 * @NAME: PaymentFallbackServiceImpl
 * @USER: zhouxk
 * @DATE: 2023/4/17
 * @TIME: 15:04
 * @DAY_NAME_FULL: 星期一
 * @PROJECT_NAME: cloud2022
 * @DESCRIPTION: fallback方法类
 */
@Component
public class PaymentFallbackServiceImpl implements PaymentHystrixService {

    @Override
    public String paymentInfoOK(Integer id) {
        return "-----PaymentFallbackServiceImpl fall back-paymentInfo_OK ,o(╥﹏╥)o";
    }

    @Override
    public String paymentInfoTimeOut(Integer id) {
        return "-----PaymentFallbackServiceImpl fall back-paymentInfo_TimeOut ,o(╥﹏╥)o";
    }

}
