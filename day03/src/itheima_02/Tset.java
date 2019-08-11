package itheima_02;

/*
 1.2抽象类名作为参数和返回值

            - 方法的形参是抽象类,其实需要的是该抽象类的子类对象
            - 方法的返回值是抽象类名,七返回值是该抽象类的子类对象
 */
public class Tset {
    public static void main(String[] args) {
        UseAnimal u = new UseAnimal();
        Animal a = new Cat();
        u.useanimal(a);

        Animal a1 = u.getanimal();
        a1.eat();

    }
}
