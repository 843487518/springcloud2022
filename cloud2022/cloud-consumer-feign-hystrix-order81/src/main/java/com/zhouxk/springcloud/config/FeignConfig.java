package com.zhouxk.springcloud.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @PACKAGE_NAME: com.zhouxk.springcloud.config
 * @NAME: FeignConfig
 * @USER: zhouxk
 * @DATE: 2023/4/17
 * @TIME: 10:17
 * @DAY_NAME_FULL: 星期一
 * @PROJECT_NAME: cloud2022
 * @DESCRIPTION: feign的配置注入
 */
@Configuration
public class FeignConfig {

    /**
     * 日志级别
     * NONE,默认，不显示
     * BASIC,
     * HEADERS,
     * FULL;
     */
    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }
}
