package com.zhouxk.springcloud.controller;

import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

/**
 * @PACKAGE_NAME: com.zhouxk.springcloud
 * @NAME: TestController
 * @USER: zhouxk
 * @DATE: 2023/6/4
 * @TIME: 14:11
 * @DAY_NAME_FULL: 星期日
 * @PROJECT_NAME: cloud2022
 * @DESCRIPTION: TODO
 */
@RestController
@RequestMapping("/test")
public class TestController {

/*    @GetMapping("/success")
    public String hello(){
        return "hello，登录成功自动跳转";
    }*/

    @GetMapping("/logout")
    public String logout(){
        return "hello，注销成功自动跳转";
    }

    @GetMapping("/hello1")
    public String hello1(){
        return "hello1";
    }

    @GetMapping("/error")
    public String hello2(){
        return "认证失败";
    }

    @GetMapping("/hello3")
    @PreAuthorize("hasAnyAuthority('admin123')")
    public String hello3(){
        return "hello3";
    }

    @GetMapping("/hello4")
    @PreAuthorize("hasAnyAuthority('admin2')")
    public String hello4(){
        return "hello4";
    }


    @GetMapping("/add")
//    @Secured("ROLE_/test/add")
    @PreAuthorize("hasAnyAuthority('/test/add')")
    //@Secured("/test/add")和@PreAuthorize("hasAnyAuthority('/test/add')")注解，在访问方法之前，会进行权限校验
    //@PostAuthorize("hasAnyAuthority('/test/add')")注解，在结束方法之后，会进行权限校验
    public String add(){
        return "add";
    }

    @GetMapping("/select")
    @PreAuthorize("hasAnyAuthority('/test/select')")
    public String select(){
        return "select";
    }

    @GetMapping("/update")
    @PreAuthorize("hasAnyAuthority('/test/update')")
    public String update(){
        return "update";
    }


    @GetMapping("/hello5")
    public Exception hello5(){
        return new Exception("出错了 ");
    }

}
