package day02_01_duotai;
/*
多态的前提和体现

- 有继承/实现方法

- 有方法重写

- 有父类引用指向子类对象
 */
public class AnimalDemo {
    public static void main(String[] args) {
        Animal a = new Cat();
        a.eat();
        //报错(编译看左,执行看右)
        //a.catchMouse();
    }
}
