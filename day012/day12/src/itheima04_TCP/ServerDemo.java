package itheima04_TCP;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

//服务端
public class ServerDemo {
    public static void main(String[] args) throws IOException {
        //创建服务器端的对象
        ServerSocket ss = new ServerSocket(12344);
        //socket accept():有阻塞效果
        //调用accept方法,获取客户端连接
        Socket s = ss.accept();
        //获取输入流,读数据
        InputStream ins = s.getInputStream();
        byte[] bys = new byte[1024];
        int len = ins.read(bys);
        System.out.println("服务器:"+new String(bys,0,len));


        //服务器端回馈,返回数据"收到了"
        OutputStream ous = s.getOutputStream();
        ous.write("我收到数据了".getBytes());
        //释放资源
        ss.close();
        s.close();
    }}
