package itheima03_IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/*
void   write(int b)将指定的字节写入此文件输出流   一次写一个字节数据
void   write(byte[] b)将 b.length字节从指定的字节数组写入此文件输出流   一次写一个字节数组数据
void   write(byte[] b, int off, int len)将 len字节从指定的字节数组开始，从偏移量off开始写入此文件输出流   一次写一个字节数组的部分数据
 */
public class IO02 {
    public static void main(String[] args) throws IOException {
         //创建文件对象
        OutputStream out = new FileOutputStream("day08\\src\\b.txt",true);//没有true则每次运行是覆盖,有的话则是添加
 //       void   write(int b)将指定的字节写入此文件输出流   一次写一个字节数据
              out.write(97);
              out.write(98);
              out.write(99);    //abc
        System.out.println("-----------");
              //void   write(byte[] b)将 b.length字节从指定的字节数组写入此文件输出流   一次写一个字节数组数据
            byte[] bys = "\r\nabc".getBytes();
            out.write(bys);   //abc
            //换行windows系统是\r\n,linux是\r,mac系统是\n
        //void   write(byte[] b, int off, int len)将 len字节从指定的字节数组开始，从偏移量off开始写入此文件输出流   一次写一个字节数组的部分数据
          out.write(bys,2,2);
               //ab(因为换行符\r\n分别是一个字节)
    }
}
