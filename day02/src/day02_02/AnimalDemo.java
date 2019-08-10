package day02_02;

public class AnimalDemo {
    public static void main(String[] args) {
        AnimalOpeartor a =new AnimalOpeartor();
        Cat c =new Cat();
        a.use(c);

        Dog d =new Dog();
         a.use(d);
    }
}
