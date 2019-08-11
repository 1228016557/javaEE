package day01_00_practice._01;

public class Test {
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        t1.setName("塔兹米");
        t1.setAge(18);
        System.out.println(t1.getName()+" "+t1.getAge());
        t1.study();

        Teacher t2 = new Teacher("红瞳",20);
        System.out.println(t2.getName()+" "+t2.getAge());
        t2.study();
    }
}
