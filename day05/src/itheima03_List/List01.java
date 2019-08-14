package itheima03_List;
/*
        特点:
​			有序（有序不是排序）
​			有索引
​			元素可重复
 常用实现类: ArrayList   LinkedLink
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class List01 {
    public static void main(String[] args) {
        //创建list对象
        List<String> list  = new ArrayList<>();
        //添加元素
        list.add("张三");
        list.add("李四");
        list.add("王二");
        list.add("张三");
    //输出list
        System.out.println(list);
         //for循环遍历
        for (int i = 0; i <list.size() ; i++) {
            String s = list.get(i);
            System.out.println(s);
        }

        System.out.println("-------------------");
        //迭代器
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            String next = it.next();
            System.out.println(next);
        }

    }
}
