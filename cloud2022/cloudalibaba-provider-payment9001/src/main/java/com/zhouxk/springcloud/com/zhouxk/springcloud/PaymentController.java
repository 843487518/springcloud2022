package com.zhouxk.springcloud.com.zhouxk.springcloud;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @PACKAGE_NAME: com.zhouxk.springcloud.com.zhouxk.springcloud
 * @NAME: PaymentController
 * @USER: zhouxk
 * @DATE: 2023/4/21
 * @TIME: 16:19
 * @DAY_NAME_FULL: 星期五
 * @PROJECT_NAME: cloud2022
 * @DESCRIPTION: TODO
 */
@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Value("${server.port}")
    public String serverPort;

    @RequestMapping("/getPayment/{id}")
    public String getPayment(@PathVariable("id") Integer id){
        return "Alibaba Nacos server "+ serverPort+"-----"+id;
    }

}
