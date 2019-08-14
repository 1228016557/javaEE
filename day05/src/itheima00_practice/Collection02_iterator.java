package itheima00_practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Collection02_iterator {
    public static void main(String[] args) {
        //创建一个collection集合
        Collection<String> c =new ArrayList<String>();
        //添加元素
        c.add("Hello");
        c.add("World");
        c.add("java");
        c.add("123");

        Iterator<String> iterator = c.iterator();
        //判断集合元素后面是否还有元素
        while (iterator.hasNext()) {
            //返回迭代器中的下一个元素
            String s = iterator.next();
            System.out.println(s);
        }
    }
}
