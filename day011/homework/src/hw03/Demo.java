package hw03;

import java.net.DatagramSocket;

/*
请编写程序，分别打印主线程的名称和子线程的名称。
		要求使用两种方式实现：
			第一种方式：继承Thread类。
			第二种方法：实现Runnable接口。
 */
public class Demo {
   // 第一种方式：继承Thread类。
    public static void main(String[] args) {
 /*      //创建thread对象
        Thread t1 = new Thread();
       Thread t2 = new Thread();
        //给线程设置名字
        t1.setName("线程1");
        t2.setName("线程2");
        System.out.println(java.lang.Thread.currentThread().getName());
       //启动线程
        t1.start();
        t2.start();
*/

        //方法二:实现Runnable接口
        //创建runnable对象
        Runnable r1 = new Runnable();
        Runnable r2 = new Runnable();
        //创建thread对象,把runnable对象当有参构造的参数传递
        java.lang.Thread t1 = new java.lang.Thread(r1,"高铁");
        java.lang.Thread t2 = new java.lang.Thread(r1,"飞机");
        System.out.println(java.lang.Thread.currentThread().getName());
    //启动线程
        t1.start();
        t2.start();

    }
}
