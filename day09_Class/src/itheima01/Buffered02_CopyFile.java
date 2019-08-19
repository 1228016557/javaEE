package itheima01;

import java.io.*;

/*
  比较四种方法的速度
  数据源:E:\黑马\javaEE\day06-day15\day08\视频\16_字节流复制图片.avi
  数据目的:day09\src\16_字节流复制图片.avi
 */
public class Buffered02_CopyFile {
    public static void main(String[] args) throws IOException {
        String  in = "E:\\黑马\\javaEE\\day06-day15\\day08\\视频\\16_字节流复制图片.avi";
        String out = "day09\\src\\16_字节流复制图片.avi";
      long start = System.currentTimeMillis();
    //   method1(in,out);  //共耗时:106951毫秒
         method2(in,out); //共耗时:264毫秒

      long  end = System.currentTimeMillis();
        System.out.println("共耗时:"+(end-start)+"毫秒");
    }
    //一次一个字节数组
    private static void method2(String in,String out) throws IOException {
        InputStream  ins = new FileInputStream(in);
        OutputStream ous = new FileOutputStream(out);
       byte[] bys = new byte[1024];
       int len = 0;
       while ((len=ins.read(bys))!=-1){
           ous.write(bys,0,len);
       }

        ins.close();
        ous.close();
    }
     //一次一个字节
    private static void method1(String in,String out) throws IOException {
        InputStream  ins = new FileInputStream(in);
        OutputStream ous = new FileOutputStream(out);
        int by;
        while ((by=ins.read())!=-1){
           ous.write(by);
        }
        ins.close();
        ous.close();
    }


}
