package itheima05;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Properties;

/*
    练习2：通过配置文件运行类中的方法
    配置文件:
        .properties文件
        .xml文件
        注解配置
 */
public class ReflectTest02 {
    public static void main(String[] args) throws Exception {
/*
  //原来的方法
        Student s =new Student();
        s.study(); //好好学习天天向上
        Teacher t = new Teacher();
        t.teach();   //用爱成就学员*/
        /*
         使用一个类的时候就要创建一个类然后再调用,在工作的时候不允许修改代码,
         所以要用其他方法,类加载刚好满足,可以把类名写在配置文件中
         创建配置文件右键点击src,选择new,选择Resource bundle,
         文件中要用methodName=teach格式写
         */
        // 1、读取配置文件
        //className=itheima05.Student,methodName=study
       // 属性列表中每个键及其对应值都是一个字符串
        Properties prop = new Properties();
        FileReader fr = new FileReader("day15\\src\\itheima05\\S01.properties");
        prop.load(fr);

      //从配置文件中获取类名和方法名
        String className = prop.getProperty("className");
        String methodName = prop.getProperty("methodName");
        // 使用反射创建对象调用方法
        //获取字节码对象
        Class<?> c = Class.forName(className);
        //获取构造方法并且创建对象
        Constructor<?> con = c.getDeclaredConstructor();
        //暴力反射
        con.setAccessible(true);
        //创建对象
        Object stu = con.newInstance();
        //调用方法
        Method Smethod = c.getDeclaredMethod(methodName);
        Smethod.invoke(stu);
    }

    }
