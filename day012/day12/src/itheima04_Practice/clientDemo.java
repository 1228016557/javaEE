package itheima04_Practice;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Stack;

//客户端,TCP通信程序练习1:服务端给出反馈
public class clientDemo {
    public static void main(String[] args) throws IOException {
        //创建客户端对象
        Socket s = new Socket("192.168.13.50",22222);
        //获取输出流写数据
        OutputStream out = s.getOutputStream();
        out.write("你好".getBytes());

        //接收反馈
        InputStream ins = s.getInputStream();
        byte[] bys = new byte[1024];
        int line = ins.read(bys);
        String data = new String(bys, 0, line);
        System.out.println(data);

        //关闭资源
        s.close();
    }
}
