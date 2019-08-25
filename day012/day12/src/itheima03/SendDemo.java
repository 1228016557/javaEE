package itheima03;

import java.io.*;
import java.net.*;

//UDP发送数据：数据来自于键盘录入，直到输入的数据是886，发送数据结束
public class SendDemo {
    public static void main(String[] args) throws IOException {
          //创建发送端的Socket对象(DatagramSocket)
        DatagramSocket ds = new DatagramSocket();
        //自己封装键盘录入
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = br.readLine())!=null){
            //输入数据886,发送结束
            if ("886".equals(line)){
                break;
            }

        //创建数据对象,并打包数据
        byte[] bys = line.getBytes();
        DatagramPacket dp = new DatagramPacket(bys,bys.length, InetAddress.getByName("192.168.13.50"),11111);

        //调用DatagramSocket对象的方法发送数据
        ds.send(dp);
        //关闭发送端
        }
        ds.close();
    }
}
