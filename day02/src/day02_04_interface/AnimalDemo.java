package day02_04_interface;

import day01_00_practice._02.Cat;

public class AnimalDemo {
    public static void main(String[] args) {

        Pig p =new Pig();
        p.eat();
        p.jm();
        p.setName("猪猪侠");
        p.setAge(5);
        System.out.println("p = " + p.getName()+" "+p.getAge());


    }
}
