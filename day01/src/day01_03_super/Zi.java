package day01_03_super;

public class Zi extends Fu {
    public int age = 30;

    public  void show(){
        int age = 20;
        System.out.println(age);
        //访问子类中的成员变量怎么办呢?  this
        System.out.println(this.age);
        //访问父类中的成员变量怎么办呢?  super
        System.out.println(super.age);
    }
}
