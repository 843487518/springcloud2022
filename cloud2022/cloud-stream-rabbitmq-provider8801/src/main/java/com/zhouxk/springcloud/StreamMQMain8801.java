package com.zhouxk.springcloud;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @PACKAGE_NAME: com.zhouxk.springcloud
 * @NAME: StreamMQMain8801
 * @USER: zhouxk
 * @DATE: 2023/4/20
 * @TIME: 15:15
 * @DAY_NAME_FULL: 星期四
 * @PROJECT_NAME: cloud2022
 * @DESCRIPTION: TODO
 */

@SpringBootApplication
@Slf4j
public class StreamMQMain8801 {
    public static void main(String[] args) {
        SpringApplication.run(StreamMQMain8801.class, args);
        log.info("Stream-消息发送模块启动:http://localhost:8801");
    }
}
