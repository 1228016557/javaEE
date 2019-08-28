package itheima01;
//继承Thrad类
public class Thread01 extends Thread {

    //重写了run方法
    @Override
    public void run() {
        for (int i = 0; i < 999; i++) {
            System.out.println(i);
        }
    }
}
