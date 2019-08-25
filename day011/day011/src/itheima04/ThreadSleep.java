package itheima04;
//static void sleep(long millis)使当前正在执行的线程停留（暂停执行）指定的毫秒数
public class ThreadSleep extends Thread{
    public ThreadSleep(String name) {
        super(name);
    }

    public ThreadSleep() {
    }

    @Override
    public void run() {
        for (int i = 0; i < 99; i++) {
            System.out.println(getName()+" "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
