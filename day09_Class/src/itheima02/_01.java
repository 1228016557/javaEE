package itheima02;


import java.io.*;

public class _01 {
    public static void main(String[] args) throws IOException {
//      writeutf8();
        readerutf8();
    }
    public static void writeutf8() throws IOException {
        Writer w = new OutputStreamWriter(new FileOutputStream("day09\\src\\c.txt"));
         w.write("你好");
         w.close();
    }
    //一次读一个字符
    public static void readerutf8() throws IOException {
       Reader r =new InputStreamReader(new FileInputStream("day09\\src\\a.txt"));
       int len=0;
       while ((len=r.read())!=-1)
       {
           System.out.print ((char)len);
       }
       r.close();
    }


}
