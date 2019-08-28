package itheima01;
/*线程创建的两种方法
​		方式一:继承Thread类
​         步骤:1.自定义一个类,继承Thread类
  				2.自定义类中的run方法,run方法中编写线程执行的任务代码
​					3.在测试类中创建自定义类的对象
​				4.自定义类对象调用start()方法启动线程*/
public class MyThreadDemo {
    public static void main(String[] args) {
        //创建Thread01对象
        Thread01 t1 = new Thread01();
        Thread01 t2 = new Thread01();

        //调用start()方法启动线程
        t1.start();
        t2.start();

    }
}
