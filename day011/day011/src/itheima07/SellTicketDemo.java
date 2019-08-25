package itheima07;

/*
- 定义一个测试类SellTicketDemo，里面有main方法，代码步骤如下
- 创建SellTicket类的对象
- 创建三个Thread类的对象，把SellTicket对象作为构造方法的参数，并给出对应的窗口名称
- 启动线程
 */
public class SellTicketDemo {
    public static void main(String[] args) {
      //创建SellTickets对象
        SellTicket s1 = new SellTicket();
        //创建Thread对象
        Thread t1 = new Thread(s1,"窗口1");
        Thread t2 = new Thread(s1,"窗口2");
        Thread t3 = new Thread(s1,"窗口3");
        //启动线程
        t1.start();
        t2.start();
        t3.start();
    }
}
