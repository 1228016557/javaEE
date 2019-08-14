package itheima05_ListIterator;

import java.util.ArrayList;
import java.util.List;

/*
   列表迭代器：ListIteractor
 */
public class ListIterator {
    public static void main(String[] args) {
        //创建对象
        List<String> l =new ArrayList<>();
        //添加元素
        l.add("hello");
        l.add("world");
        l.add("java");
        //获取列表迭代器
        java.util.ListIterator<String> lit = l.listIterator();
        //迭代
      while(lit.hasNext()){
          String next = lit.next();
          if (next.equals("world")){
              lit.add("javaee");
          }
      }
        System.out.println(l);
    }
}
