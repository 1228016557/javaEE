package itheima00_practice.forzengqiang;

import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider;

import java.util.ArrayList;
import java.util.List;

//增强for循环
public class for01 {
    public static void main(String[] args) {
        //输出int数组
        int[] arr = {0,52,75,22,23};
        for (int i :arr){
            System.out.println(i);
        }
        //输出string数组
        String[] s ={"hello","world","java"};
        for (String ss :s){
            System.out.println(ss);
        }
           //输出数组
        List<Student> l =new ArrayList<>();
        Student s1 = new Student("张一",20);
        Student s2 = new Student("张二",20);
        Student s3 = new Student("张三",20);
        l.add(s1);
        l.add(s2);
        l.add(s3);

        for (Student student : l) {
            System.out.println(student.getName()+" "+student.getAge());
        }

    }
}
