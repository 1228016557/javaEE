package itheima04_Linkedhashset;

import java.util.Iterator;
import java.util.LinkedHashSet;

/*
1.哈希表和链表实现的set接口,具有可预测的迭代次序
2.由链表保证元素**有序**，也就是说元素的存储和取出顺序是一致的
3.由哈希表保证元素**唯一**，也就是说没有重复的元素
 */
public class LinkedhashSet01 {
    public static void main(String[] args) {
        //创建linkedhashset集合
        LinkedHashSet<Integer> lh = new LinkedHashSet<>();
        //添加元素
        lh.add(12);
        lh.add(5);
        lh.add(9);
        lh.add(17);
    //增强for循环输出
        for (Integer integer : lh) {
            System.out.print(integer+" ");   //12 5 9 17
        }

        //分割线
        System.out.println();
        System.out.println("------");
        //迭代器方式输出
        Iterator<Integer> iterator = lh.iterator();
        while (iterator.hasNext()){
            Integer next = iterator.next();
            System.out.print(next+" ");    //12 5 9 17
        }
    }

}
