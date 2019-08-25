package itheima09;

import java.io.*;
import java.net.Socket;

//客户端:客户端：数据来自于文本文件
public class ClientDemo {
    public static void main(String[] args) throws IOException {
        //创建对象
        Socket s = new Socket("192.168.13.50",33333);
        //从文件中接收数据
        BufferedReader br = new BufferedReader(new FileReader("day12\\a.txt"));
        //封装输出流写数据
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        String line;
        while ((line = br.readLine())!=null){
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        //结束标识符
        s.shutdownOutput();

        //接收反馈
        BufferedReader brclient =new BufferedReader(new InputStreamReader(s.getInputStream()));
        String date = brclient.readLine();
        System.out.println("服务器的反馈:"+date);

        //关闭资源
        bw.close();
        s.close();
    }
}
