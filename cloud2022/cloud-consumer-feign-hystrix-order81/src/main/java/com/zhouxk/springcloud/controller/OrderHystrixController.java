package com.zhouxk.springcloud.controller;

import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.zhouxk.springcloud.service.PaymentHystrixService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @PACKAGE_NAME: com.zhouxk.springcloud.controller
 * @NAME: OrderHystrixController
 * @USER: zhouxk
 * @DATE: 2023/4/17
 * @TIME: 10:05
 * @DAY_NAME_FULL: 星期一
 * @PROJECT_NAME: cloud2022
 * @DESCRIPTION: TODO
 */

@RestController
@Slf4j
//@DefaultProperties(defaultFallback = "payment_Global_FallbackMethod")// hystrix 全局fallback方法
public class OrderHystrixController {

    @Resource
    private PaymentHystrixService paymentHystrixService;

    @GetMapping("/consumer/payment/hystrix/ok/{id}")
    public String paymentInfoOK(@PathVariable("id") Integer id) {
        String result = paymentHystrixService.paymentInfoOK(id);
        return result;
    }


    @GetMapping("/consumer/payment/hystrix/timeout/{id}")
//    @HystrixCommand(commandProperties = {@HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "2000")
//    })
//    @HystrixCommand(fallbackMethod = "paymentTimeOutFallbackMethod",
//            commandProperties = {@HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "2000")
//            })
    @HystrixCommand
    public String paymentInfoTimeOut(@PathVariable("id") Integer id) {
        String result = paymentHystrixService.paymentInfoTimeOut(id);
        return result;
    }

    /**
     * 超时访问，设置自身调用超时的峰值，峰值内正常运行，超过了峰值需要服务降级 自动调用fallbackMethod 指定的方法
     *
     * 超时异常或者运行异常 都会进行服务降级
     *
     * @param id
     * @return
     */
    /*public String paymentTimeOutFallbackMethod(@PathVariable("id") Integer id) {
        return "我是消费者81,对方支付系统繁忙请10秒钟后再试或者自己运行出错请检查自己,o(╥﹏╥)o";
    }*/

    /**
     * hystrix 全局fallback方法
     *
     * @return
     */
/*    public String payment_Global_FallbackMethod() {
        return "Global异常处理信息，请稍后再试，/(ㄒoㄒ)/~~";
    }*/

}
