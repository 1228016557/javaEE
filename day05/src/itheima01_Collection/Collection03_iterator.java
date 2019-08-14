package itheima01_Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
        - 迭代器，集合的专用遍历方式
        - Iterator<E> iterator()：返回此集合中元素的迭代器，通过集合的iterator()方法得到
        - 迭代器是通过集合的iterator()方法得到的，所以我们说它是依赖于集合而存在的
   iterator中常用的方法
   E next():返回迭代中的下一个元素
   boolean hasNext(); 如果迭代具有更多元素，则返回true
 */
public class Collection03_iterator {
    public static void main(String[] args) {
        //创建一个collection集合
        Collection<String>  c =new ArrayList<String>();
        //添加元素
        c.add("Hello");
        c.add("World");
        c.add("java");
        c.add("123");
        c.add("456");
        Iterator<String> iterator = c.iterator();

        //判断集合元素后面是否还有元素
        while (iterator.hasNext()) {
            //返回迭代器中的下一个元素
            String s = iterator.next();
            System.out.println(s);
        }
    }

}


