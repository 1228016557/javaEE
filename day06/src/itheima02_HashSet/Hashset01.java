package itheima02_HashSet;
//无序  唯一
import java.util.HashSet;
import java.util.Iterator;

public class Hashset01 {
    public static void main(String[] args) {
        //创建对象
        HashSet<String> hs =new HashSet<>();
        //添加元素
        hs.add("hello");
        hs.add("world");
        hs.add("java");
        hs.add("world");
      //  System.out.println(hs);  //[world, java, hello]
        //增强for
        for (String s :hs){
            System.out.println(s);
        }
        System.out.println("--------");
      //迭代器
        Iterator<String> iterator = hs.iterator();
        while (iterator.hasNext()){
            String next = iterator.next();
            System.out.println(next);
        }
    }
}
