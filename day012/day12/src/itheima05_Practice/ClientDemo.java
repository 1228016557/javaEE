package itheima05_Practice;

import java.io.*;
import java.net.Socket;

/*
案例需求
客户端：数据来自于键盘录入, 直到输入的数据是886，发送数据结束
服务端：接收到数据在控制台输出 */
public class ClientDemo {
    public static void main(String[] args) throws IOException {
        //创建客户端Socket对象
        Socket s = new Socket("192.168.13.50", 33333);

        //数据来自于键盘录入, 直到输入的数据是886，发送数据结束
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //封装输出流
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        String line;
        while ((line = br.readLine()) != null) {
            if ("886".equals(line)) {
                break;
            }
            //输出数据
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        //释放资源
        s.close();
    }
}
