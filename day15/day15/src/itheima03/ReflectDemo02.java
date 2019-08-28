package itheima03;

import itheima02.Student;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

//通过反射获取成员变量并赋值
public class ReflectDemo02 {
    public static void main(String[] args) throws Exception {
      //创建字节码对象
        Class<Student> c = Student.class;
        //获取构造方法创建对象
        Constructor<Student> con = c.getDeclaredConstructor();
        Student s1 = con.newInstance();
        //获取成员变量name,并赋值
        Field name = c.getDeclaredField("name");
         //暴力反射
        name.setAccessible(true);
        name.set(s1,"张三");
        System.out.println(s1);//Student{name='张三', age=0, address='null'}
        //获取age成员变量,并赋值
        Field age = c.getDeclaredField("age");
        //暴力反射
        age.setAccessible(true);
        age.set(s1,20);
        System.out.println(s1);//Student{name='张三', age=20, address='null'}

        //获取adress成员变量,并赋值
        Field adress = c.getDeclaredField("address");
        //暴力反射
        adress.setAccessible(true);
        adress.set(s1,"西安");
        System.out.println(s1); //Student{name='张三', age=20, address='西安'}


        //获取当前对象的成员变量的值
        //name值

        System.out.println(name.get(s1)); //张三
        //age值
        System.out.println(age.get(s1));//20
        //adress值
        System.out.println(adress.get(s1)); //西安

    }
}
