package itheima03_IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/*
字节流读数据(一次读一个字节数据)
- 字节输入流
  - FileInputStream(String name)：通过打开与实际文件的连接来创建一个FileInputStream ，该文件由文件系统中的路径名name命名
- 字节输入流读取数据的步骤
  - 创建字节输入流对象
  - 调用字节输入流对象的读数据方法
  - 释放资源
 */
public class IO03 {
    public static void main(String[] args) throws IOException {
         //创建输入流对象
        InputStream  ips = new FileInputStream("day08\\src\\a.txt");

        int bys;
         //while
        while((bys=ips.read())!=-1){
            System.out.print((char) bys);
        }

    }
}
