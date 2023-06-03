package com.zhouxk.study.thread;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;

/**
 * @PACKAGE_NAME: com.zhouxk.study.thread
 * @NAME: MyReEntryLock
 * @USER: zhouxk
 * @DATE: 2023/4/27
 * @TIME: 17:05
 * @DAY_NAME_FULL: 星期四
 * @PROJECT_NAME: cloud2022
 * @DESCRIPTION: 可重入锁
 */
@Slf4j
public class MyReEntryLock {
    public static void main(String[] args) {
        //测试同步方法
        MyReEntryLock myReEntryLock = new MyReEntryLock();
        new Thread(()-> {
            myReEntryLock.m1();
        },"t").start();

        //测试同步代码块
        /*Object o = new Object();
        new Thread(()-> {
            synchronized (o){
                log.info("外层方法执行");
                synchronized (o){
                    log.info("中层方法执行");
                    synchronized (o){
                        log.info("内层方法执行");
                        log.info("内层方法退出");
                    }
                    log.info("中层方法退出");
                }
                log.info("外层方法退出");
            }
        },"t").start();*/
    }

    public synchronized void m1(){
        log.info("m1()开始");
        m2();
        log.info("m1()结束");

    }
    public synchronized void m2(){
        log.info("m2()开始");
        m3();
        log.info("m2()结束");

    }
    public synchronized void m3(){
        log.info("m3()开始");
        log.info("m3()结束");
    }
}

