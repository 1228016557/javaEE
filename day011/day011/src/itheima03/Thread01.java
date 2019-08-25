package itheima03;
//继承Thrad类
public class Thread01 extends Thread {
    public Thread01() {
    }

    public Thread01(String name) {
        super(name);
    }

    //重写了run方法
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName() +": "+i);
        }
    }
}
