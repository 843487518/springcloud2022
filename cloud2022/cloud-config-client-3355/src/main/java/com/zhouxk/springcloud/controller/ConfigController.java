package com.zhouxk.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @PACKAGE_NAME: com.zhouxk.springcloud.controller
 * @NAME: ConfigController
 * @USER: zhouxk
 * @DATE: 2023/4/19
 * @TIME: 20:13
 * @DAY_NAME_FULL: 星期三
 * @PROJECT_NAME: cloud2022
 * @DESCRIPTION: TODO
 */
@RestController
@RefreshScope
public class ConfigController {

    @Value("${config.info}")
    private String configInfo;

    @GetMapping("/configInfo")
    public String getConfigInfo() {
        return configInfo;
    }
}
