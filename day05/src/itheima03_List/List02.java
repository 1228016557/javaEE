package itheima03_List;

import java.util.ArrayList;
import java.util.List;

/*
List的特有方法
        void add(int index,E   element)在此集合中的指定位置插入指定的元素
        E remove(int   index)删除指定索引处的元素，返回被删除的元素
        E set(int index,E   element)修改指定索引处的元素，返回被修改的元素
        E get(int   index)返回指定索引处的元素
 */
public class List02 {
    public static void main(String[] args) {
        //创建对象
        List<String>   l  =new ArrayList<>();
        //添加元素
        l.add("张三");
        l.add("李四");
        l.add("王二");
   //1.测试add特有方法，void add(int index,E   element)在此集合中的指定位置插入指定的元素
        l.add(1,"java");
        System.out.println(l);   //[张三, java, 李四, 王二]

        //2.  E remove(int   index)删除指定索引处的元素，返回被删除的元素
        l.remove(0);
        System.out.println(l);//[java, 李四, 王二]

         //3.  E set(int index,E   element)修改指定索引处的元素，返回被修改的元素
        l.set(1,"world");
        System.out.println(l);//[java, world, 王二]

        //4.E get(int   index)返回指定索引处的元素
        System.out.println(l.get(2));//王二


    }
}
