package day01_00_practice;

public class Zi extends Fu {
    int age = 30;

    public Zi( int age) {
        this.age = age;
        System.out.println("子类有参");
    }

    public Zi() {
        System.out.println("子类无参");
    }

    public void show(){
         int age = 20;
         //就近原则,局部变量age
        System.out.println(age);
        //访问成员变量
        System.out.println(this.age);
        //访问父类
        System.out.println(super.age);
    }
    public void method(){
        //this当前对象的引用
        this.showone();
        //super父类的引用
        super.showone();
    }
    public void showone(){
        System.out.println("子类showone");
   }
}
