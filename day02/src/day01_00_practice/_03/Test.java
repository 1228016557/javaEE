package day01_00_practice._03;

import day02_05_interfaceAndAbstrance.Home;

public class Test {
    public static void main(String[] args) {
        Use u = new Use();
        Cat c =new Cat();
        Dog d =new Dog();
        Pig p = new Pig();
        //在家吃饭
        u.athomeeat(c);
        u.athomeeat(d);
        //看门
        u.lookhome(d);
        u.lookhome(p);

    }
}
