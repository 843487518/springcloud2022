package com.zhouxk.springcloud.listener;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.apache.bcel.generic.FieldGenOrMethodGen;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

/**
 * @PACKAGE_NAME: com.zhouxk.springcloud.listener
 * @NAME: ReceiveMessageListener
 * @USER: zhouxk
 * @DATE: 2023/4/20
 * @TIME: 15:34
 * @DAY_NAME_FULL: 星期四
 * @PROJECT_NAME: cloud2022
 * @DESCRIPTION: TODO
 */
@Component
@EnableBinding(Sink.class)
@Slf4j
public class ReceiveMessageListener {
    @Value("${server.port}")
    private String serverPort;

    @StreamListener(Sink.INPUT)
    public void input(Message<String> message) {
        log.info("port:" + serverPort + "\t接受：" + message.getPayload());
    }

}
