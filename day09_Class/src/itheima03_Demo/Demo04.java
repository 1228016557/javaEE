package itheima03_Demo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/*
案例需求

把ArrayList集合中的学生数据写入到文本文件。要求：每一个学生对象的数据作为文件中的一行数据
​        格式：学号,姓名,年龄,居住地	举例：itheima001,林青霞,30,西安
实现步骤

- 定义学生类
- 创建ArrayList集合
- 创建学生对象
- 把学生对象添加到集合中
- 创建字符缓冲输出流对象
- 遍历集合，得到每一个学生对象
- 把学生对象的数据拼接成指定格式的字符串
- 调用字符缓冲输出流对象的方法写数据
- 释放资源
 */
public class Demo04 {
    public static void main(String[] args) throws IOException {
        //创建集合
        ArrayList<Student> arr =new ArrayList<>();
         //创建学生类并且添加
         arr.add( new Student("itheima001","黑瞳",12,"北京"));
         arr.add( new Student("itheima001","红瞳",20,"北京"));
         arr.add( new Student("itheima001","塔兹米",18,"北京"));
       //创建缓冲输出流对象
        BufferedWriter bw = new BufferedWriter(new FileWriter("day09\\aa.txt"));
        //遍历集合，得到每一个学生对象
        for (Student s : arr) {
          //  把学生对象的数据拼接成指定格式的字符串
            StringBuilder sb =new StringBuilder();
            sb.append(s.getSid()).append(",").append(s.getName()).append(",").append(s.getAge()).append(",").append(s.getAddress());
            //        调用字符缓冲输出流对象的方法写数据
             bw.write(sb.toString());
             bw.newLine();
             bw.flush();
        }
//                - 释放资源
       bw.close();
    }
}
