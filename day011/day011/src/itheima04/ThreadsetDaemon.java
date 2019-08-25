package itheima04;

public class ThreadsetDaemon extends Thread {
    public ThreadsetDaemon() {
    }

    public ThreadsetDaemon(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName()+" "+i);
        }
    }
}
