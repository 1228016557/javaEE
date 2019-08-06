package day01_07_CatAndDog;

public class AnimalTest {
    public static void main(String[] args) {


        //1.无参构造方法猫
        Cat c1 = new Cat();
        c1.setName("加菲猫");
        c1.setAge(5);
        System.out.println(c1.getName() + "," + c1.getAge());
        c1.catchMouse();

        //2.有参构造方法猫
        Cat c2 = new Cat("加菲猫", 5);
        System.out.println(c2.getName() + "," + c2.getAge());
        c2.catchMouse();


        //3.无参构造方法狗
        Dog d = new Dog();
        d.setName("皮皮狗");
        d.setAge(3);
        System.out.println(d.getName() + "," + d.getAge());
        d.lookdog();

        //4.有参构造方法狗
        Dog d1 = new Dog("皮皮狗", 3);
        System.out.println(d1.getName() + "," + d1.getAge());
        d1.lookdog();
    }


}
