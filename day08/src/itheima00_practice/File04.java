package itheima00_practice;

import java.io.*;

/*
        数据源:D:\C盘的图片文档等\ScreenShot\1.jpg
        数据目的: day08\src\1.jpg
 */
public class File04 {
    public static void main(String[] args) throws IOException {
        InputStream in = new FileInputStream("D:\\C盘的图片文档等\\ScreenShot\\1.jpg");
        OutputStream out =new FileOutputStream("day08\\src\\1.jpg");
       //循环改写
        byte[] bys =new byte[100];
        int len;
        while ((len = in.read(bys))!=-1){
           out.write(bys,0,len);
        }
       //关闭资源
        out.close();
        in.close();

    }


}
