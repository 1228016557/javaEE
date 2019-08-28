package itheima04;

import itheima02.Student;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

//获取成员方法
/*
步骤:
​			获取字节码对象
​			获取指定的成员方法对象
​			创建对象
​			调用invoke方法使用指定的成员方法执行起来
 */
public class ReflectDemo01 {
    public static void main(String[] args) throws Exception {
        //获取字节码对象
        Class<Student> c = Student.class;
        //获取指定的成员方法对象
        Method method1 = c.getMethod("method1");
        //创建对象
        Constructor<Student> con = c.getConstructor();
        Student s = con.newInstance();
        //调用invoke方法使用指定的成员方法执行起来
        method1.invoke(s);   //method
    }
}
