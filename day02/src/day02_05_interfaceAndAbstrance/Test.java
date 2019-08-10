package day02_05_interfaceAndAbstrance;

public class Test {
    public static void main(String[] args) {

        Home h = new Home();
        Cat c = new Cat();
        h.athome(c);

       LookDoor d =new Dog();
            h.lk(d);
            LookDoor s=new Pig();
            Animal a =(Animal)s;
    }
}
