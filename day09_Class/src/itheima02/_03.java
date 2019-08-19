package itheima02;

import java.io.*;

public class _03 {
    public static void main(String[] args) throws IOException {
        //创建输入缓冲流对象,绑定数据源
        Reader r = new BufferedReader(new FileReader("day09\\src\\a.txt"));
        //创建输出缓冲流对象,绑定数据目的
        Writer w = new BufferedWriter(new FileWriter("day09\\src\\a1.txt"));
        //循环读写
        char[] chs = new char[1024];
        int len;
        while ((len=r.read(chs))!=-1){
            w.write(chs);
        }
        //关闭资源
       w.close();
        r.close();
    }
}
