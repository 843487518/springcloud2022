package com.zhouxk.springcloud.service;

import com.zhouxk.springcloud.controller.TestController;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Priority;

/**
 * @PACKAGE_NAME: com.zhouxk.springcloud.service
 * @NAME: GlobalExceptionHandler
 * @USER: zhouxk
 * @DATE: 2023/6/6
 * @TIME: 22:21
 * @DAY_NAME_FULL: 星期二
 * @PROJECT_NAME: cloud2022
 * @DESCRIPTION: TODO
 */
/*@ControllerAdvice(assignableTypes = {TestController.class})
public class GlobalExceptionHandler {
    @ResponseBody
    @ExceptionHandler(Exception.class)
    public String handleException(Exception e) {
        return "测试统一异常捕获:"+e.getMessage();
    }
}*/
