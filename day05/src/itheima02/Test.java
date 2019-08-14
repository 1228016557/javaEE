package itheima02;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
        案例需求

​	创建一个存储学生对象的集合，存储3个学生对象，使用程序实现在控制台遍历该集合
 */
public class Test {
    public static void main(String[] args) {
        //创建collection对象
        Collection<Student> c = new ArrayList<>();
        //创建学生对象
        Student s1 =new Student("张三",12);
        Student s2 =new Student("李四",13);
        Student s3 =new Student("王二",22);
        //添加元素
        c.add(s1);
        c.add(s2);
        c.add(s3);
        //创建迭代器
        Iterator<Student> iterator = c.iterator();

        //循环输出
        while(iterator.hasNext()){
            Student next = iterator.next();
            System.out.println(next.getName()+" "+next.getAge());
        }


    }
}
