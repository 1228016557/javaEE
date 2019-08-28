package itheima02;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/*
访问类中的private修饰的构造方法
setAccessible(true),越过权限检查,设置可以访问
不是public修饰,都要用暴力反射setAccessible(true)
 */
public class ReflectDemo03 {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //获取字节码对象
        Class<Student> c = Student.class;
        //获取构造方法,因为该构造方法为private修饰,所以要运用getDeclaredConstructor方法获取
        Constructor<Student> con = c.getDeclaredConstructor(String.class);
        //暴力反射,越过权限检查,设置可以访问
        con.setAccessible(true);
        //创建对象
        Student student = con.newInstance("林青霞");
        System.out.println(student);  //Student{name='林青霞', age=0, address='null'}
    }

}
