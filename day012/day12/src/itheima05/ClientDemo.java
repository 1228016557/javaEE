package itheima05;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
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
        OutputStream out = s.getOutputStream();
        out.write("helloworld".getBytes());


        //获取输入流对象,接收对象
        InputStream ins = s.getInputStream();
        byte[] bys = new byte[1024];
        int len = ins.read(bys);
        System.out.println("客户端:"+new String(bys,0,len));
        //关闭资源
        s.close();
    }
}
