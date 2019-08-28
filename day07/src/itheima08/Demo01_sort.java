package itheima08;

import java.util.*;

/*
    案例需求

- ArrayList存储学生对象，使用Collections对ArrayList进行排序
- 要求：按照年龄从小到大排序，年龄相同时，按照姓名的字母顺序排序
 */
public class Demo01_sort {
    public static void main(String[] args) {
        //创建对象
        List<Student> list = new ArrayList<>();
        //创建学生对象,并添加
        list.add(new Student("黑瞳",12));
        list.add(new Student("红瞳",18));
        list.add(new Student("塔兹米",18));
        list.add(new Student("大哥",28));
        //排序
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                int num = s1.getAge() - s2.getAge();
               int num2= num==0? s2.getName().compareTo(s1.getName()):num;
                return num2;
            }
        });
        for (Student s : list) {
            System.out.println(s.getName()+" "+s.getAge());
        }

    }
}
