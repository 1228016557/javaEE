package itheima09_Lock;
/*
解决方法: lock锁
void lock()获得锁
void unlock()释放锁
 */

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

//定义一个类SellTicket实现Runnable接口，里面定义一个成员变量：private int tickets = 100;
public class SellTicket implements Runnable {
    //票数
    private int tickets = 100;
//    private Object obj =new Object();
    Lock lock = new ReentrantLock();
    @Override
    public void run() {
//        - 在SellTicket类中重写run()方法实现卖票，代码步骤如下
//                - 判断票数大于0，就卖票，并告知是哪个窗口卖的
        while (true) {
            //括号中可以是任意引用对象,例如例如:"asd"
//            synchronized (obj) {
            try{lock.lock();
                if (tickets > 0) {
                    try {
                        lock.lock();
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "正在出售第" + tickets + "张票");
//                - 卖了票之后，总票数要减1
                    tickets--;
//                - 票没有了，也可能有人来问，所以这里用死循环让卖票的动作一直执行

                }
            }finally {
                lock.unlock();
            }
        }
           // }
        }
    }

