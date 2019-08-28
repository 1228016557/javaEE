package itheima02;
/*
无参构造
Constructor<?>[] getConstructors()返回所有公共构造方法对象的数组
Constructor<?>[] getDeclaredConstructors()返回所有构造方法对象的数组
Constructor<T> getConstructor(Class<?>... parameterTypes)返回单个公共构造方法对象
Constructor<T> getDeclaredConstructor(Class<?>... parameterTypes)返回单个构造方法对象
 */
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectDemo01 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //获取Class对象
        Class<?> c = Class.forName("itheima02.Student");
        //通过字节码对象中的方法获取构造方法对象
        Constructor<?> con = c.getConstructor();
        //调用Constructor类中的newInstance方法创建对象
        Object s1 = con.newInstance();
        System.out.println(s1);  //Student{name='null', age=0, address='null'}



    }
}
