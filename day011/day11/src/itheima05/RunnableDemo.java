package itheima05;
/*
 实现Runnable接口的类(推荐使用)
步骤:
- 定义一个类MyRunnable实现Runnable接口
- 在MyRunnable类中重写run()方法
- 创建MyRunnable类的对象
- 创建Thread类的对象，把MyRunnable对象作为构造方法的参数
- 启动线程
 */
public class RunnableDemo {
    public static void main(String[] args) {
        //创建对象
        Runnable r1 = new Runnable();
        Runnable01 r2 = new Runnable01();
        //创建Thead对象,把Runnable对象作为构造方法的参数
        Thread t1 = new Thread(r1,"高铁😁");
        Thread t2 = new Thread(r2,"飞机😡");

        //启动线程
        t2.start();
        t1.start();
    }
}
