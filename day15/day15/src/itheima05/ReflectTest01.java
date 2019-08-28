package itheima05;

import java.lang.reflect.Method;
import java.util.ArrayList;

/*
    练习1：我有一个ArrayList<Integer>集合，现在我想在这个集合中添加一个字符串数据，如何实现？
    使用反射可以完成该需求
        泛型只在编译时期有效，编译之后就没有了（泛型的擦除）
        Xxx.java -编译->Xxx.class-加载->Class<Xxx>
 */
public class ReflectTest01 {
    public static void main(String[] args) throws Exception {
        //创建集合对象
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
//        list.add("php");// 直接调用add方法不能存储String类型的数据，因为泛型在起作用，它规定了类型必须是Integer
      //解决方法
        //// 通过反射去调用add方法即可完成需求
        //获取字节码文件
        Class<? extends ArrayList> c = arr.getClass();
        //已经有对象了,所以直接获取方法对象
        Method add = c.getMethod("add", Object.class);
        //调用方法
        Object ss = add.invoke(arr,"php");

        //输出集合,注意如果用遍历的话,类型需要是object,因为集合中有Integer类型还有String类型
        System.out.println(arr);   //[10, 20, 30, php]



    }
}
