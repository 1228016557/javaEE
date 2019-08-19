package itheima03_IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/*
- 字节流抽象基类
  - InputStream：这个抽象类是表示字节输入流的所有类的超类
  - OutputStream：这个抽象类是表示字节输出流的所有类的超类
  - 子类名特点：子类名称都是以其父类名作为子类名的后缀
- 字节输出流
  - FileOutputStream(String name)：创建文件输出流以指定的名称写入文件
 */
public class IO01 {
    public static void main(String[] args) throws IOException {
//        - 创建字节输出流对象(调用系统功能创建了文件，创建字节输出流对象，让字节输出流对象指向文件)
        OutputStream  out = new FileOutputStream("day08\\src\\a.txt");
//                - 调用字节输出流对象的写数据方法
          out.write(97);  // (97=a)
          out.write(98);  // (97=a)
          out.write(99);  // (97=a)
//                - 释放资源(关闭此文件输出流并释放与此流相关联的任何系统资源)
           out.close();
    }
}
