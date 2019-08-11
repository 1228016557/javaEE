package itheima00_Practice.NimingOutertwo;

import itheima00_Practice.fly.Brid;

public class Test {
    public static void main(String[] args) {
        //原来的做法，新建类，创建对象
            Fly f1 = new Bird();
            method(f1);

            //匿名内部类的方法
        Fly f2 =new Fly() {
            @Override
            public void fly() {
                System.out.println("鸟会飞了");
            }
        };
        f2.fly();


    }


    public static void method(Fly f){
        f.fly();
    }
}
