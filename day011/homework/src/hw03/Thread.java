package hw03;

public class Thread  extends java.lang.Thread {
    public Thread() {
    }

    public Thread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+":"+i);}
    }
}
