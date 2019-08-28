package hw6;

public class Run implements Runnable {
    @Override
    public void run() {

while (true){
    Thread.currentThread().setName("子线程执行");
            System.out.println(Thread.currentThread().getName());}
    }
}
