package com.zhouxk.springcloud.service;

/**
 * @PACKAGE_NAME: com.zhouxk.springcloud.service
 * @NAME: IMessageProviderService
 * @USER: zhouxk
 * @DATE: 2023/4/20
 * @TIME: 15:18
 * @DAY_NAME_FULL: 星期四
 * @PROJECT_NAME: cloud2022
 * @DESCRIPTION: TODO
 */
public interface IMessageProviderService {

    /**
     * 定义消息的推送管道
     *
     * @return
     */
    String send();
}
