package itheima06;

import java.io.*;
import java.net.Socket;

/*
 客户端给服务器端发送“helloworld”，服务器端接收到该数据反转后转大写写回客户端
    客户端接收并打印在控制台
    客户端
        1、发送数据
        2、接收数据
 */
public class ClientDemo {
    public static void main(String[] args) throws IOException {
        //创建对象
        Socket s =new Socket("192.168.13.50",15432);
        //获取输出流发送数据
        PrintWriter p =new PrintWriter(s.getOutputStream(),true);
        p.println("hello");


        //获取输入流对象,接收对象
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        //关闭资源
        s.close();
    }
}
