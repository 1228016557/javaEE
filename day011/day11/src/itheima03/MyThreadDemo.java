package itheima03;

/*线程优先级
final int getPriority()返回此线程的优先级
final void setPriority(int newPriority)更改此线程的优先级
      线程默认优先级是5；线程优先级的范围是：1-10
​		*/
public class MyThreadDemo {
    public static void main(String[] args) {
        //创建Thread01对象,用带参构造方法设置主线程的名字
        Thread01 t1 = new Thread01("one");
        Thread01 t2 = new Thread01("two");
        Thread01 t3 = new Thread01("three");
      //获取3个对象的优先级
        int priority1 = t1.getPriority();
        int priority2 = t2.getPriority();
        int priority3 = t3.getPriority();
        //输出优先级


       //改变主线程的优先级


        //设置优先级
        t1.setPriority(10);
        t2.setPriority(5);
        t3.setPriority(1);


/*         设置线程名
        t1.setName("one1");
        t2.setName("two2");*/
        //调用start()方法启动线程

        t1.start();
        t2.start();
        t3.start();
//        //设置主方法名称  Thread.currentThread()返回对当前正在执行的线程对象的引用
//        Thread.currentThread().setName("主线程");
//        //获取主方法名称
//        System.out.println(Thread.currentThread().getName());

    }
}
