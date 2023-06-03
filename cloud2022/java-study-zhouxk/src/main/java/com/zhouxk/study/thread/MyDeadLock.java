package com.zhouxk.study.thread;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @PACKAGE_NAME: com.zhouxk.study.thread
 * @NAME: MyDeadLock
 * @USER: zhouxk
 * @DATE: 2023/4/27
 * @TIME: 17:35
 * @DAY_NAME_FULL: 星期四
 * @PROJECT_NAME: cloud2022
 * @DESCRIPTION: 死锁案例
 */
@Slf4j
public class MyDeadLock {
    public static void main(String[] args) {
//        Object o1 = new Object();
//        Object o2 = new Object();
        ReentrantLock lock1 = new ReentrantLock();
        ReentrantLock lock2 = new ReentrantLock();
        new Thread(()->{
            lock1.lock();
            try {
                log.info(Thread.currentThread().getName()+"持有lock1，想获取lock2");
                TimeUnit.SECONDS.sleep(1);
                lock2.lock();
                try{
                    log.info(Thread.currentThread().getName()+"获取到了lock2");
                }finally {
                    lock2.unlock();
                }

            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock1.unlock();
            }

        },"A").start();

        new Thread(()->{
            lock2.lock();
            try {
                log.info(Thread.currentThread().getName()+"持有lock2，想获取lock1");
                TimeUnit.SECONDS.sleep(1);
                lock1.lock();
                try{
                    log.info(Thread.currentThread().getName()+"获取到了lock1");
                }finally {
                    lock1.unlock();
                }

            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock2.unlock();
            }

        },"B").start();
    }
}
