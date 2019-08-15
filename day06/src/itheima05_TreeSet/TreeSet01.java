package itheima05_TreeSet;

import java.util.TreeSet;

/*
        TreeSet : 排序   唯一
 */
public class TreeSet01 {
    public static void main(String[] args) {
        //创建Tree集合
        TreeSet<Integer> t = new TreeSet<>();
        //添加元素
        t.add(10);
        t.add(85);
        t.add(8);
        t.add(5);
        //增强for输出
        for (Integer integer : t) {
            System.out.print(integer+" ");  // 结果：5 8 10 85
        }
    }
}
