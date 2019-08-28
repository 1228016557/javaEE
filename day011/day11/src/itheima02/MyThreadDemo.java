package itheima02;

/*线程创建的两种方法
​		方式一:继承Thread类
​         步骤:1.自定义一个类,继承Thread类
  				2.自定义类中的run方法,run方法中编写线程执行的任务代码
​					3.在测试类中创建自定义类的对象
​				4.自定义类对象调用start()方法启动线程*/
public class MyThreadDemo {
    public static void main(String[] args) {
        //创建Thread01对象,用带参构造方法设置主线程的名字
        Thread01 t1 = new Thread01("one");
        Thread01 t2 = new Thread01("two");

/*         设置线程名
        t1.setName("one1");
        t2.setName("two2");*/
        //调用start()方法启动线程
        t1.start();
        t2.start();

        //设置主方法名称  Thread.currentThread()返回对当前正在执行的线程对象的引用
        Thread.currentThread().setName("主线程");
        //获取主方法名称
        System.out.println(Thread.currentThread().getName());

    }
}
