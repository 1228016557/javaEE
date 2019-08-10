package day01_00_practice._02;

public class Cat  extends Animal{
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
    public void show(){
        System.out.println("name = " + name);
    }
}
