package itheima_09_System;

public class System_CurrentTimeMillis {
    public static void main(String[] args) {
        //接收开始时间
        double start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            System.out.println(i);
        }
        //接受结束时间
        double end = System.currentTimeMillis();

        System.out.println("共耗时：" + (end - start) + "毫秒");
    }
}
