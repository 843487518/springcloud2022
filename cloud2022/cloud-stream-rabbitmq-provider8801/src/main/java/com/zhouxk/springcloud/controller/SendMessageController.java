package com.zhouxk.springcloud.controller;

import com.zhouxk.springcloud.service.IMessageProviderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @PACKAGE_NAME: com.zhouxk.springcloud.controller
 * @NAME: SendMessageController
 * @USER: zhouxk
 * @DATE: 2023/4/20
 * @TIME: 15:17
 * @DAY_NAME_FULL: 星期四
 * @PROJECT_NAME: cloud2022
 * @DESCRIPTION: TODO
 */
@RestController
public class SendMessageController {
    @Resource
    private IMessageProviderService messageProviderService;

    @GetMapping(value = "/sendMessage")
    public String sendMessage() {
        return messageProviderService.send();
    }

}