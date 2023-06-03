package com.zhouxk.study;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @PACKAGE_NAME: com.zhouxk.study
 * @NAME: JavaStudyMain8001
 * @USER: zhouxk
 * @DATE: 2023/4/26
 * @TIME: 21:03
 * @DAY_NAME_FULL: 星期三
 * @PROJECT_NAME: cloud2022
 * @DESCRIPTION: TODO
 */

@Slf4j
@SpringBootApplication
public class JavaStudyMain8001 {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(JavaStudyMain8001.class, args);
        Object bean = run.getBean("");
        log.info("项目启动:http://localhost:8001");
    }
}

