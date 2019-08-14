package itheima01_Collection;

import java.util.ArrayList;
import java.util.Collection;

/*
        创建collection集合对象
                    多态的方法
                    Arraylist()
 */
public class Collection01 {
    public static void main(String[] args) {
        //用动态的方法创建Collection集合的对象
        Collection<String> c =new ArrayList<String>();
        //用add添加元素
        c.add("Hello");
        c.add("World");
        c.add("java");
        //输出集合对象(collection重写了toString方法)
        System.out.println(c);
    }
}
