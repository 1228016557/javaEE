package itheima03;

import java.util.HashSet;

public class HashsetTest {
    public static void main(String[] args) {
        //创建集合
        HashSet<Student> hs =new HashSet<>();
        //创建student对象
        Student s1 =new Student("张一",20);
        Student s2 =new Student("张二",20);
        Student s3 =new Student("张三",20);
        Student s4 =new Student("张三",20);//student类写了equals方法和hashcode方法
        //添加元素
        hs.add(s1);
        hs.add(s2);
        hs.add(s3);
        hs.add(s4);
      //增强for输出
        for (Student h : hs) {
            System.out.println(h.getName()+" "+h.getAge());
        }
    }}
                    //输出结果：张三 20
                               //张二 20
                               //张一 20
