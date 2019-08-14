package itheima01_Collection;

import java.util.ArrayList;
import java.util.Collection;

/*
    boolean add(E e)添加元素
    boolean remove(Object o)从集合中移除指定的元素
    void   clear()清空集合中的元素
    boolean contains(Object o)判断集合中是否存在指定的元素
    boolean isEmpty()判断集合是否为空int
     size()集合的长度，也就是集合中元素的个数
 */
public class Collection02 {
    public static void main(String[] args) {
        Collection<String>  c =new ArrayList<String>();
        //        boolean add(E e)添加元素
           c.add("Hello");
           c.add("World");
           c.add("java");
        System.out.println(c);   //[Hello, World, java]
        // boolean remove(Object o)从集合中移除指定的元素
                c.remove("java");
     //   System.out.println( c.remove("hello")); //false
        System.out.println(c);// [Hello, World]
//        void   clear()清空集合中的元素
      /*
        c.clear();
        System.out.println(c); //[]
         */
//        boolean contains(Object o)判断集合中是否存在指定的元素
   //     System.out.println(c.contains("Hello"));  //true
    //    System.out.println(c.contains("hello"));  //false
//        boolean isEmpty()判断集合是否为空int
       System.out.println(c.isEmpty()); //false

//        size()集合的长度，也就是集合中元素的个数
        System.out.println(c.size());

    }
}
