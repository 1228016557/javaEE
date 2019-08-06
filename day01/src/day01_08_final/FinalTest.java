package day01_08_final;
/*
测试类
 */
public class FinalTest {
    public static void main(String[] args) {
        //final修饰基本数据类型
        final  int age = 20;
//        age =100; //报错 final修饰以后不能再次改变值
        System.out.println(age);

     //final修饰引用数据类型
        final  Student s =new Student();
        s.age = 100;
        //final修饰指的是引用类型的地址值不能发生改变,但是地址里面的内容是可以发生改变的
        System.out.println(s.age);
    }
}
