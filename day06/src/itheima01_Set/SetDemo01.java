package itheima01_Set;
/*  ​	常用子类:HashSet  :无序 唯一
​				LinkedHashSet  有序  唯一
 				TreeSet:排序   唯一
 */
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo01 {
    public static void main(String[] args) {
        Set<String> s1 = new HashSet<>();//HashSet无序 唯一
        s1.add("张三");
        s1.add("王二");
        s1.add("李四");
        s1.add("张三"); //[李四, 张三, 王二]
        System.out.println(s1);
        System.out.println("------------");
        Set<String> s2 = new LinkedHashSet<>();//	LinkedHashSet  有序  唯一
        s2.add("张三");
        s2.add("王二");
        s2.add("李四");
        s2.add("张三");
        System.out.println(s2);  //[张三, 王二, 李四]
        System.out.println("---------");
        Set<String> s3 = new TreeSet<>();//	TreeSet:排序   唯一
        s3.add("2");
        s3.add("8");
        s3.add("5");
        s3.add("1");
        System.out.println(s3);//[1, 2, 5, 8]
    }
}
