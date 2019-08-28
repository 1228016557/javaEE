package itheima05;
//定义一个类MyRunnable实现Runnable接口
public class Runnable01 implements java.lang.Runnable {
    //重写run方法
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            //Runnable没有getname方法,所以需要借助thread获取线程名字
        System.out.println(Thread.currentThread().getName()+" "+i);
        }
    }
}
