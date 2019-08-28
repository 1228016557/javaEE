package itheima03;

import itheima02.Student;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/*
获取成员变量并赋值
1.获取字节码对象
​		2.通过字节码对象获取成员变量对象
​		3.创建对象(反射),指定你要给那个对象中的成员变量赋值
​		4.通过成员变量对象调用set方法给成员变量赋值
 */
public class ReflectDemo01 {
    public static void main(String[] args) throws Exception {
        //获取字节码对象
        Class<Student> c = Student.class;
        //通过字节码对象获取成员变量对象
        Field addressField = c.getField("address");
        //创建对象(反射),指定你要给那个对象中的成员变量赋值
        Constructor<Student> con = c.getConstructor();
        Student s1 = con.newInstance();
        //通过成员变量对象调用set方法给成员变量赋值
        addressField.set(s1,"北京");
        System.out.println(s1); //Student{name='null', age=0, address='北京'}
    }
}
