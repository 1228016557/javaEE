package itheima00_practice;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
/*
void write(int b) 将指定的字节写入此文件输出流 一次写一个字节数据
void write(byte[] b)
将 b.length字节从指定的字节数组写入此文件输出流 一次写一个字节数组 数据
void write(byte[] b, int oﬀ, int len)
将 len字节从指定的字节数组开始，从偏移量oﬀ开始写入此文件输出流 一 次写一个字节数组的部分数据
 */
public class File02 {
    public static void main(String[] args) throws IOException {
        //创建对象
        OutputStream out = new FileOutputStream("day08\\src\\aaa.txt");
       out.write(49);
       out.write(48);
       out.write(48);
       out.write("\r\n".getBytes());

       byte[] bys = {48,58,59,58};
       out.write(bys);

       out.write("\r\nhello.world\r\n".getBytes());
        out.write("hello.world".getBytes(),1,2);
   out.close();
    }
}
