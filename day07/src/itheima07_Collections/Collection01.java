package itheima07_Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
Collections类常用方法:
public static void sort(List<T> list)将指定的列表按升序排序
public static void reverse(List<?> list)反转指定列表中元素的顺序
public static void shuffle(List<?> list)使用默认的随机源随机排列指定的列表
 */
public class Collection01 {
    public static void main(String[] args) {
        //创建对象
        List<Integer>  list = new ArrayList<>();
        //添加元素
        list.add(10);
        list.add(50);
        list.add(80);
        list.add(30);
        list.add(70);
//        public static void sort(List<T> list)将指定的列表按升序排序
        Collections.sort(list);
        System.out.println(list);  //[10, 30, 50, 70, 80]

//        public static void reverse(List<?> list)反转指定列表中元素的顺序
        Collections.reverse(list);
        System.out.println(list);//[80, 70, 50, 30, 10]

//        public static void shuffle(List<?> list)使用默认的随机源随机排列指定的列表
        Collections.shuffle(list);
        System.out.println(list);//每一次运行都会打乱顺序 [30, 70, 80, 50, 10]   [50, 10, 30, 70, 80]

    }

}
