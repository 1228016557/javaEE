package itheima04;

public class ThreadSleppDemo {
    public static void main(String[] args) {

    //创建对象并给线程设置名称
    ThreadSleep t1 =  new ThreadSleep("曹操");
    ThreadSleep t2 =  new ThreadSleep("刘备");
    ThreadSleep t3 =  new ThreadSleep("孙权");
    //调用start方法,开启线程
    t1.start();
    t2.start();
    t3.start();

    }
    }
