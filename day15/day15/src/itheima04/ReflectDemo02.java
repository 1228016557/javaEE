package itheima04;

import itheima02.Student;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/*
案例需求
- 通过反射获取成员方法并调用
 */
public class ReflectDemo02 {
    public static void main(String[] args) throws Exception {
        //创建字节码对象
        Class<Student> c = Student.class;
        //创建对象
        Constructor<Student> con = c.getConstructor();
        Student s = con.newInstance();
        //调用四种方法
        Method m1 = c.getMethod("method1");
        Object i1 = m1.invoke(s);

        Method m2 = c.getMethod("method2", String.class);
        Object i2 = m2.invoke(s, "林青霞");

        Method m3 = c.getMethod("method3", String.class, int.class);
        Object i3 = m3.invoke(s, "林青霞", 30);

        Method f = c.getDeclaredMethod("function");
        f.setAccessible(true);
        f.invoke(s);
    }
}
