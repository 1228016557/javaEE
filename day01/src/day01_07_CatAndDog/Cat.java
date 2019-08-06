package day01_07_CatAndDog;
//猫类
public class Cat extends Animal {
    public Cat() {
    }

    public Cat(String name, int age) {
        super(name, age);
    }
    public  void catchMouse(){
        System.out.println("抓老鼠");
    }
}
