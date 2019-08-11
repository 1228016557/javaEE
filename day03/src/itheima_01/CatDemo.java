package itheima_01;

public class CatDemo {
    public static void main(String[] args) {
        Use u = new Use();
        Cat c =new Cat();
        u.usecat(c);

       Cat c2 =  u.getcat();
        c2.eat();

    }
}
