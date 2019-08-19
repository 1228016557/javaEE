package itheima03_Demo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/*
集合到文件
 */
public class Demo01 {
    public static void main(String[] args) throws IOException {
        //创建集合
        ArrayList<String> arr = new ArrayList<>();
        //添加元素
        arr.add("hello");
        arr.add("world");
        arr.add("java");
        //创建缓冲输出流
        BufferedWriter bw = new BufferedWriter(new FileWriter("day09\\z.txt"));
        //循环读写
        for (String s : arr) {
            bw.write(s);
            bw.newLine();
            bw.flush();
        }
      bw.close();
    }}
