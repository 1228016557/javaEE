package itheima01;

import java.io.*;
/*
        - lBufferOutputStream：该类实现缓冲输出流。 通过设置这样的输出流，应用程序可以向底层输出流写入字节，而不必为写入的每个字节导致底层系统的调用
- lBufferedInputStream：创建BufferedInputStream将创建一个内部缓冲区数组。 当从流中读取或跳过字节时，内部缓冲区将根据需要从所包含的输入流中重新填充，一次很多字节
 */
//缓冲流:一次一个字符数组
public class Buffered01 {
    public static void main(String[] args) throws IOException {
        //输入缓冲流
        BufferedInputStream in = new BufferedInputStream(new FileInputStream("day09\\src\\a.txt"));
        //输入缓冲流
        BufferedOutputStream bout = new BufferedOutputStream(new FileOutputStream("day09\\src\\b.txt"));
       //创建byte数组
        byte[] bys = new byte[2048];
        //记录读入字节的长度(为-1则表示到末尾)
        int len =0;
       //while循环用来获取字节并输出字节
        while ((len=in.read(bys))!=-1){
            bout.write(bys,0,len);
        }
        //释放资源
        in.close();
        bout.close();
    }
}
