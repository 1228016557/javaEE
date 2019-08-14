package itheima04;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
        List集合存储学生对象并遍历
 */
public class error_bingfaxiugai {
    public static void main(String[] args) {
      //创建List集合对象
        List<Student> l =new ArrayList<>();
        //创建学生对象
        Student s1 = new Student("塔兹米",20);
        Student s2 = new Student("红瞳",18);
        Student s3 = new Student("黑瞳",12);
        Student s4 = new Student("瞳",12);
        //给List集合添加元素
        l.add(s1);
        l.add(s2);
        l.add(s3);
        //用迭代器输出集合元素的内容
       //创建迭代器方式
        Iterator<Student> iterator = l.iterator();
        while (iterator.hasNext()){
            Student next = iterator.next();
            if(next.equals(s2)){
                l.add(s4);
            }
        }





    }
}
