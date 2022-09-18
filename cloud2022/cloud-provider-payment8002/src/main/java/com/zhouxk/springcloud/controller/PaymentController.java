package com.zhouxk.springcloud.controller;

import com.zhouxk.springcloud.entities.CommonResult;
import com.zhouxk.springcloud.entities.Payment;
import com.zhouxk.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @BelongsProject: cloud2022
 * @BelongsPackage: com.zhouxk.springcloud.controller
 * @Author: zhouxk
 * @CreateTime: 2022-09-17  12:23
 * @Description: 支付模块控制器
 * @Version: 1.0
 */
@RestController
@Slf4j
@RequestMapping("/payment")
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @GetMapping("get/{id}")
    public CommonResult<Payment> selectOne(@PathVariable("id") Long id) {
        Payment payment = this.paymentService.queryById(id);
        log.info("select success， serverPort：{}，result：{}",serverPort,payment);
        return new CommonResult(200, "select success， serverPort：" + serverPort, payment);
    }

    @PostMapping("create")
    public CommonResult<Payment> create(@RequestBody Payment payment) {
        Payment insert = this.paymentService.insert(payment);
        log.info("insert success， serverPort：{}，result：{}",serverPort,insert);
        return new CommonResult(200, "insert success， serverPort：" + serverPort, insert);
    }

    @GetMapping("queryAllByLimit")
    public CommonResult<List<Payment>> queryAllByLimit(@RequestParam(defaultValue = "0") int offset,
                                                       @RequestParam(defaultValue = "10") int limit) {
        List<Payment> payment = this.paymentService.queryAllByLimit(offset, limit);
        log.info("select success， serverPort：{}，result：{}",serverPort,payment);
        return new CommonResult(200, "select success， serverPort：" + serverPort, payment);
    }


}
