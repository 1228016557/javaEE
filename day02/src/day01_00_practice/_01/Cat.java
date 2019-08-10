package day01_00_practice._01;

public class Cat extends Animal {
    String name = "猫";
    int age = 5;

    @Override
    public void eat() {
        System.out.println("猫吃了");
    }
    public void method(){
        System.out.println("猫类特有的方法");
    }
}
