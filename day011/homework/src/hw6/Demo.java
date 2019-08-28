package hw6;

public class Demo {
    public static void main(String[] args) {
         //设置主线程的名称
        Thread.currentThread().setName("主线程执行");

            //创建线程
            Run r = new Run();
            Thread t = new Thread(r,"子线程执行");
            //启动线程
            t.start();
        while (true) {

            System.out.println(Thread.currentThread().getName());
        }
}}
