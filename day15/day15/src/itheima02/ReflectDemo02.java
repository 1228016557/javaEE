package itheima02;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/*
有参构造方法创建对象
构造方法里的
 */
public class ReflectDemo02 {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
         //获取class对象
        Class<Student> c = Student.class;
        //获取有参构造方法
        Constructor<Student> con = c.getConstructor(String.class, int.class, String.class);
        //创建对象
        Student student = con.newInstance("林青霞", 30, "西安");
        System.out.println(student);
    }
}
