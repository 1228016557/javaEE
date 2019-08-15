package itheima06_comparable;

import java.util.TreeSet;

/*

 */
public class Test {
    public static void main(String[] args) {
        TreeSet<Person> t = new TreeSet<>();
        //创建对象
        Person p1 = new Person("张一",20);
        Person p2 = new Person("张二",24);
        Person p3 = new Person("张三",28);
        Person p4 = new Person("张四",20);

        t.add(p1);
        t.add(p2);
        t.add(p3);
        t.add(p4);

            System.out.println(t);

    }
}
