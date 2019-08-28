package itheima05;
//定义一个类MyRunnable实现Runnable接口
public class Runnable implements java.lang.Runnable {
    //重写run方法
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            //Runnable没有getname方法,所以需要借助thread
        System.out.println(Thread.currentThread().getName()+" "+i);
        }
    }
}
