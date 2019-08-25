package itheima07;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

//服务器
/*
   服务器端
        1、接收数据
        2、字符串反转然后转大写
        3、发送数据
 */
public class ServerDemo {
    public static void main(String[] args) throws IOException {
        //创建服务器端对象
        ServerSocket ss = new ServerSocket(9528);
        //调用accept方法
        Socket s = ss.accept();
        //获取输入流
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String line;
        while ((line=br.readLine())!=null){
            System.out.println(line);
        }
          ss.close();
    }
}
