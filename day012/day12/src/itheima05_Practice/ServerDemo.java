package itheima05_Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

//服务端：接收到数据在控制台输出
public class ServerDemo {
    public static void main(String[] args) throws IOException {
        //创建服务器端的对象
        ServerSocket ss =new ServerSocket(33333);
        //调用accept方法,监听客户端的连接
        Socket s = ss.accept();
        //接收数据,获取输入流
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String line;
        while ((line=br.readLine())!=null){
            System.out.println("服务器:"+line);
        }
        ss.close();
    }
}
