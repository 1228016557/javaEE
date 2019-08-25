package itheima04_TCP;
//客户端
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class CilentDemo {
    public static void main(String[] args) throws IOException {
        //创建客户端Socket对象
        //Socket(InetAddress address,int port)创建流套接字并将其连接到指定IP指定端口号
        Socket s = new Socket("192.168.13.50",12344);
        //获取输出流,写对象
        OutputStream o = s.getOutputStream();
        o.write("你好".getBytes());
        //客户端接收数据
        InputStream ins = s.getInputStream();
        byte[] bys = new byte[1024];
        int len = ins.read(bys);
        System.out.println("客户端:"+new String(bys,0,len));
        //释放资源
        s.close();
    }
}
