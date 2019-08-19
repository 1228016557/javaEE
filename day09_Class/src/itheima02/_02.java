package itheima02;
//一次复制一个字符
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//赋值文本,
public class _02 {
    public static void main(String[] args) throws IOException {
        //创建输入流
        FileReader fr =new FileReader("day09\\src\\itheima02\\_01.java");
        //创建输出流
        FileWriter fw =new FileWriter("day09\\src\\.abx.txt");
        //复制文本
          char[] chs = new char[1024];
          int len;
          while ((len=fr.read(chs))!=-1)
          {
              fw.write(chs,0,len);
          }
        //关闭资源
        fw.close();
        fr.close();

    }
}
