package day02_05_interfaceAndAbstrance;

public class Dog extends Animal implements LookDoor{

    @Override
    public void loohdoor() {
        System.out.println("狗看门");
    }

    @Override
    void eat() {
        System.out.println("狗吃肉");
    }
}
