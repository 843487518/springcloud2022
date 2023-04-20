package com.zhouxk.springcloud.service.impl;

import com.zhouxk.springcloud.service.IMessageProviderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * @PACKAGE_NAME: com.zhouxk.springcloud.service.impl
 * @NAME: MessageProviderServiceImpl
 * @USER: zhouxk
 * @DATE: 2023/4/20
 * @TIME: 15:19
 * @DAY_NAME_FULL: 星期四
 * @PROJECT_NAME: cloud2022
 * @DESCRIPTION: TODO
 */
//定义消息的推送管道 将Channel和Exchanges绑定在一起
@EnableBinding({Source.class})
@Slf4j
public class MessageProviderServiceImpl implements IMessageProviderService {
    /**
     * 消息发送管道/信道
     */
    @Resource
    private MessageChannel output;

    @Override
    public String send() {
        String serial = UUID.randomUUID().toString();
        Message<String> stringMessage = MessageBuilder.withPayload(serial).build();
        output.send(stringMessage);
        log.info("*****serial: " + serial);
        return serial;
    }
}