package com.zhouxk.study.thread;

import lombok.extern.slf4j.Slf4j;

/**
 * @PACKAGE_NAME: com.zhouxk.study.thread
 * @NAME: MyStart
 * @USER: zhouxk
 * @DATE: 2023/4/26
 * @TIME: 21:10
 * @DAY_NAME_FULL: 星期三
 * @PROJECT_NAME: cloud2022
 * @DESCRIPTION: TODO
 */
@Slf4j
public class MyStart {
    public static void main(String[] args) {
        Object o = new Object();
        MyThread1 myThread1 = new MyThread1();
        myThread1.setName("MyThread1");
        myThread1.start();
        log.info("main方法运行了");
    }

}

@Slf4j
class MyThread1 extends Thread{
    @Override
    public void run() {
        log.info(this.getName()+"运行了run（）");
    }
}
