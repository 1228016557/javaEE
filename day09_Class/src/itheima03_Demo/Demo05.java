package itheima03_Demo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/*
- 案例需求

  把文本文件中的数据读取到集合中，并遍历集合。要求：文件中每一行数据是一个学生对象的成员变量值
   举例：itheima001,林青霞,30,西安

- 实现步骤

  - 定义学生类
  - 创建字符缓冲输入流对象
  - 创建ArrayList集合对象
  - 调用字符缓冲输入流对象的方法读数据
  - 把读取到的字符串数据用split()进行分割，得到一个字符串数组
  - 创建学生对象
  - 把字符串数组中的每一个元素取出来对应的赋值给学生对象的成员变量值
  - 把学生对象添加到集合
  - 释放资源
  - 遍历集合
 */
public class Demo05 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("day09\\aa.txt"));
        ArrayList arr = new ArrayList();
        String line;
        while ((line = br.readLine())!=null){
            String[] strings = line.split(",");
            Student s =new Student();
            s.setSid(strings[0]);
            s.setName(strings[1]);
            s.setAge(Integer.parseInt(strings[2]));
            s.setAddress(strings[3]);
            arr.add(s);
        }
        br.close();
   System.out.println(arr);

    }
}
