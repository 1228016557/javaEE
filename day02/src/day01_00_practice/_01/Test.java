package day01_00_practice._01;

public class Test {
    public static void main(String[] args) {
        Animal  a =new Animal();
        System.out.println(a.name);
        a.eat();

        Cat c = new Cat();
        System.out.println(c.name);
        System.out.println(c.age);
        c.eat();
        c.method();

        System.out.println("----------");

        Animal s = new Cat();
        System.out.println(s.name);
//        System.out.println(s.age);  报错
        s.eat();

    }
}
