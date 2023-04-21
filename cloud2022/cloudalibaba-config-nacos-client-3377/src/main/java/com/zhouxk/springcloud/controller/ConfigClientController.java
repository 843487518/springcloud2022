package com.zhouxk.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @PACKAGE_NAME: com.zhouxk.springcloud.controller
 * @NAME: ConfigClientController
 * @USER: zhouxk
 * @DATE: 2023/4/21
 * @TIME: 15:57
 * @DAY_NAME_FULL: 星期五
 * @PROJECT_NAME: cloud2022
 * @DESCRIPTION: TODO
 */
@RestController
@RefreshScope  //支持nacos的动态刷新功能
public class ConfigClientController {

    @Value("${config.info}")
    private String configInfo;

    @GetMapping("/config/info")
    public String getConfigInfo() {
        return configInfo;
    }
}
