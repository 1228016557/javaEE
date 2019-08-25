package itheima04_Practice;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

//服务端
public class ServerDemo {
    public static void main(String[] args) throws IOException {
        //创建服务器对象
        ServerSocket ss = new ServerSocket(22222);
        //调用accept()方法
        Socket s = ss.accept();
        //获取输入流,接收对象
        InputStream ins = s.getInputStream();
     byte[] bys = new byte[1024];
        int len = ins.read(bys);
        String data = new String(bys, 0, len);
        System.out.println("服务端接收到的数据:"+data);
        //给出反馈,获取输出流
        OutputStream out = s.getOutputStream();
        out.write("我已经收到了".getBytes());

         s.close();
         ss.close();
    }
}
