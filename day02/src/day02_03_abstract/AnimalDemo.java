package day02_03_abstract;

public class AnimalDemo {
    public static void main(String[] args) {
        Animal a =new Pig();
        a.eat();
        a.setName("猪猪侠");
        a.setAge(5);
        System.out.println(a.getName()+" "+a.getAge());

        Animal a1 =new Pig("猪猪侠",5);
        System.out.println(a.getName()+" "+a.getAge());
        a1.eat();
    }
}
