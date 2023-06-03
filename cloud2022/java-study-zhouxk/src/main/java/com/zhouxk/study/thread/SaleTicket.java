package com.zhouxk.study.thread;

import jdk.nashorn.internal.ir.CallNode;
import lombok.extern.slf4j.Slf4j;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @PACKAGE_NAME: com.zhouxk.study.thread
 * @NAME: SaleTicket
 * @USER: zhouxk
 * @DATE: 2023/4/27
 * @TIME: 0:10
 * @DAY_NAME_FULL: 星期四
 * @PROJECT_NAME: cloud2022
 * @DESCRIPTION: 卖票
 */
public class SaleTicket {
    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        new Thread(()->{ for (int i = 0; i < 100 ; i++) ticket.sale();},"a").start();
        new Thread(()->{ for (int i = 0; i < 100 ; i++) ticket.sale();},"b").start();
        new Thread(()->{ for (int i = 0; i < 100 ; i++) ticket.sale();},"c").start();
    }
}

@Slf4j
class Ticket{
    private int number = 100;
    ReentrantLock lock = new ReentrantLock();
    public void sale(){
        lock.lock();
        try{
            if (number>0){
                log.info(Thread.currentThread().getName()+"卖出第：\t"+(number--)+"\t还剩下："+number);
            }
        }finally {
            lock.unlock();
        }
    }
}
