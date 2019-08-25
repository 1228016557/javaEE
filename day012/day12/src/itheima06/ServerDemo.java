package itheima06;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
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
        //创建服务器对象
        ServerSocket ss = new ServerSocket(15432);
        // 调用accept方法，获取客户端连接
        Socket s = ss.accept();
         //获取输入流接收数据
        InputStream ins = s.getInputStream();
        byte[] bys = new byte[1024];
        int len = ins.read(bys);
        String str  = new String(bys,0,len);
        System.out.println("服务器端:"+str);
       //字符串反转然后转大写
        String newstr = new StringBuffer(str).reverse().toString().toUpperCase();
        //发送数据
        OutputStream out = s.getOutputStream();
        out.write(newstr.getBytes());

    }
}
