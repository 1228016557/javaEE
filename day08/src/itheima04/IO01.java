package itheima04;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/*
字节流复制文本文件
实现步骤

- 复制文本文件，其实就把文本文件
的内容从一个文件中读取出来(数据源)，然后写入到另一个文件中(目的地)
 */
public class IO01 {
    public static void main(String[] args) throws IOException {
            //创建对象
        InputStream ips = new FileInputStream("day08\\src\\a.txt");
         //新建一个数组(byte)
        byte[] bys =new  byte[1024];
         int len;
         while ((len=ips.read(bys))!=-1){
             System.out.print(new String(bys,0,len));  //abc
         }
           ips.close();

    }
}
