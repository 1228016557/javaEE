package day01_00_practice._03;

public class Dog extends Animal implements lh{
    @Override
    void eat() {
        System.out.println("狗吃肉");
    }
    public void lookdoor(){
        System.out.println("狗看门");
    }
}
