package itheima03;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class ReceiveDemo {
    public static void main(String[] args) throws IOException {
        //创建对象
        DatagramSocket ds = new DatagramSocket(11111);
        while (true) {
            //创建数据包用于接收对象
            byte[] bys = new byte[1024];
            DatagramPacket dp = new DatagramPacket(bys, bys.length);
            //调用DatagramSocket对象的方法接收数据
            ds.receive(dp);
            System.out.println("数据是:"+ new String(dp.getData(),0,dp.getLength()));
        }
    }
}
