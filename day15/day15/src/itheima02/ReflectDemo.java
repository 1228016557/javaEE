package itheima02;
/*
获取Class类对象的三种方式
- 类名.class属性
- 对象名.getClass()方法
- Class.forName(全类名)方法
 */
public class ReflectDemo {
    public static void main(String[] args) throws ClassNotFoundException {
        //使用类的class属性来获取该类对应的Class对象
        Class<Student> c1 = Student.class;
        System.out.println(c1);//class itheima02.Student

        Class<Student> c2 = Student.class;
        System.out.println(c1==c2);//true
        System.out.println("-----------");


        //调用对象的getClass()方法，返回该对象所属类对应的Class对象
        Student s = new Student();
        Class<? extends Student> c3 = (Class<? extends Student>) s.getClass();
        System.out.println(c1==c3);//true
        System.out.println("-------");

        //使用Class类中的静态方法forName(String className)
        Class<?> c4 = Class.forName("itheima02.Student");
        System.out.println(c4==c1); //true


    }
}
