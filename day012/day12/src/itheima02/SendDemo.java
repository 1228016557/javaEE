package itheima02;
/*
DatagramSocket()创建数据报套接字并将其绑定到本机地址上的任何可用端口
DatagramPacket(byte[] buf,int len,InetAddress add,int port)创建数据包,发送长度为len的数据包到指定主机的指定端口
void send(DatagramPacket p)发送数据报包
void close()关闭数据报套接字
void receive(DatagramPacket p)从此套接字接受数据报包
发送数据的步骤

- 创建发送端的Socket对象(DatagramSocket)
- 创建数据，并把数据打包
- 调用DatagramSocket对象的方法发送数据
- 关闭发送端
 */
import javax.sound.sampled.ReverbType;
import java.io.IOException;
import java.net.*;

public class SendDemo {
    public static void main(String[] args) throws IOException {
        //创建Socket对象
        DatagramSocket ds = new DatagramSocket();
        //创建数据并打包数据
        byte[] bys = "hello world".getBytes();
        DatagramPacket dp = new DatagramPacket(bys,bys.length, InetAddress.getByName("255.255.255.255"),10086);
        //创建DatagramPacket对象的方法发送数据
        ds.send(dp);
        //关闭发送端
        ds.close();
    }
}
