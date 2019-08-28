package itheima08;
/*
解决方法:
           synchronized(任意对象) {
	多条语句操作共享数据的代码
}
synchronized(任意对象)：就相当于给代码加锁了，任意对象就可以看成是一把锁
 */

//定义一个类SellTicket实现Runnable接口，里面定义一个成员变量：private int tickets = 100;
public class SellTicket implements Runnable {
    //票数
    private int tickets = 100;
    private Object obj =new Object();
    @Override
    public void run() {
//        - 在SellTicket类中重写run()方法实现卖票，代码步骤如下
//                - 判断票数大于0，就卖票，并告知是哪个窗口卖的
        while (true) {
            //括号中可以是任意引用对象,例如例如:"asd"
            synchronized (obj) {
                if (tickets > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "正在出售第" + tickets + "张票");
//                - 卖了票之后，总票数要减1
                    tickets--;
//                - 票没有了，也可能有人来问，所以这里用死循环让卖票的动作一直执行

                }
            }
        }
    }
}
