package itheima00_practice;

import java.util.ArrayList;
import java.util.Collection;

/*
        创建Collection集合对象（多态方法Arraylist）
        boolean add(E e)添加元素
        boolean remove(Object o)从集合中移除指定的元素
        void   clear()清空集合中的元素
        boolean contains(Object o)判断集合中是否存在指定的元素
        boolean isEmpty()判断集合是否为空,空为
        trueint   size()集合的长度，也就是集合中元素的个数
 */
public class Collection01 {
    public static void main(String[] args) {
        //创建对象
        Collection<String> c =new ArrayList<>();
        //add添加元素
        c.add("hello");
        c.add("world");
        c.add("java");

        //remove移除元素
      //  System.out.println( c.remove("hello")); //true
        c.remove("hello");

        //contains 判断是否包含此元素
        c.contains("hello");
       // System.out.println(c.contains("hello"));  //false
      //  System.out.println(c.contains("world"));  //true

        //clear清空元素
       // c.clear();    //  集合元素为空，输出则为[]

        //isEmpty  判断集合是否为空   空为true
        c.isEmpty();
       // System.out.println(c.isEmpty());   //false

        //size  返回集合的长度
        c.size();
        System.out.println(c.size());  //2
        //输出
        System.out.println(c);
    }
}
