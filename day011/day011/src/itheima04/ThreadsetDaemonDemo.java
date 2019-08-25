package itheima04;
//void setDaemon(boolean on)参数为true,将此线程标记为守护线程，当运行的线程都是守护线程时，Java虚拟机将退出
public class ThreadsetDaemonDemo {
    public static void main(String[] args) {

    //创建对象
    ThreadsetDaemon t1 = new ThreadsetDaemon("关羽");
    ThreadsetDaemon t2 = new ThreadsetDaemon("张飞");
    //设置主线程的名字
    Thread.currentThread().setName("刘备");
    //设置守护线程,当主线程运行完后,守护线程也会随之消失
        t1.setDaemon(true);
        t2.setDaemon(true);

        //打开线程
        t1.start();
        t2.start();

        //主线程程序
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
}
    }
