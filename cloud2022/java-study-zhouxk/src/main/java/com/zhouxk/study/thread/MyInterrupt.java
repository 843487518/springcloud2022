package com.zhouxk.study.thread;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * @PACKAGE_NAME: com.zhouxk.study.thread
 * @NAME: MyInterrupt
 * @USER: zhouxk
 * @DATE: 2023/4/27
 * @TIME: 18:41
 * @DAY_NAME_FULL: 星期四
 * @PROJECT_NAME: cloud2022
 * @DESCRIPTION: 中断案例
 */
@Slf4j
public class MyInterrupt {


    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            while (true) {
                if (Thread.currentThread().isInterrupted()) {
                    log.info(Thread.currentThread().getName() + "被中断，主动退出");
                    break;
                }
                log.info(Thread.currentThread().getName() + "正在运行");
                try {
                    TimeUnit.SECONDS.sleep(10);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    e.printStackTrace();
                }
            }
        }, "t1");
        t1.start();
        try{
            TimeUnit.SECONDS.sleep(5);
        }catch (Exception e){

        }
        new Thread(()-> {
            t1.interrupt();
        },"t2").start();

    }


    //模拟中断案例
    /*static AtomicBoolean aBoolean = new AtomicBoolean(false);
    static volatile boolean isStop = false;


    public static void main(String[] args) {
        new Thread(()-> {
            while (true){
                if (aBoolean.get()){
                    log.info(Thread.currentThread().getName()+"aBoolean被修改为true，退出");
                    break;
                }
                log.info(Thread.currentThread().getName()+"正在运行");
            }
        },"t1").start();
        try{
            TimeUnit.SECONDS.sleep(5);
        }catch (Exception e){

        }
        new Thread(()-> {
            aBoolean.set(true);
        },"t2").start();
    }*/

}
