package hw7;
/*
编写程序，创建两个线程对象，一根线程循环输出“播放背景音乐”
，另一根线程循环输出“显示画面”
，要求线程实现Runnable接口，且使用匿名内部类实现
 */
public class Demo {
    public static void main(String[] args) {
        Thread t = new Thread(new Run01());
        Thread t1 = new Thread(new Run02());
        t.start();
         t1.start();
    }
}
