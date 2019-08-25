package itheima08;

import java.io.*;
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
        int i =0;
        //创建对象
        Socket s = new Socket("192.168.13.50", 9528);
        //封装输出流
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(s.getOutputStream()),true);
        //封装输入流,直到输出886结束
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = br.readLine()) != null) {
            if ("886".equals(line)) {
                break;
            }
            //获取输出流写数据
            pw.println(line);
        }
        //释放资源
        s.close();
    }}
