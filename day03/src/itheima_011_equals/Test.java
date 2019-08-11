package itheima_011_equals;

public class Test {
    public static void main(String[] args) {
        Person p =new Person();
        Person p1 =new Person();
        p.setName("asd");
        p.setAge(20);
        p1.setName("asd");
        p1.setAge(20);

        System.out.println(p1.equals(p));
    }
}
