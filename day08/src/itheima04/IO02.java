package itheima04;

import java.io.*;

/*
字节流复制图片
- 案例需求
  ​	把“复制到模块目录下
- 实现步骤
  - 根据数据源创建字节输入流对象
  - 根据目的地创建字节输出流对象
  - 读写数据，复制图片(一次读取一个字节数组，一次写入一个字节数组)
  - 释放资源
 */
public class IO02 {
    public static void main(String[] args) throws IOException {
            //创建对象
        InputStream ips = new FileInputStream("day08\\src\\1.jpg");

        OutputStream out =new FileOutputStream("day08\\src\\2.jpg");
         //新建一个数组(byte)
        byte[] bys =new  byte[1024];
         int len;
         while ((len=ips.read(bys))!=-1){
           out.write(bys,0,len);
         }
           ips.close();
          out.close();

    }
}
