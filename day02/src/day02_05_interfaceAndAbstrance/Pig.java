package day02_05_interfaceAndAbstrance;

public class Pig extends Animal implements LookDoor {
    @Override
    public void loohdoor() {
        System.out.println("猪看门");
    }

    @Override
    void eat() {
        System.out.println("猪吃白菜");
    }
}
