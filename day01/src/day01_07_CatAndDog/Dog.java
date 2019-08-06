package day01_07_CatAndDog;
//狗类
public class Dog extends Animal{
    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }
    public  void lookdog(){
        System.out.println("看门");
    }
}
