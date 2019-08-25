package itheima09;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/*
案例需求
客户端：数据来自于文本文件
服务器：接收到的数据写入文本文件
 */
//服务端
public class ServerDemo {
    public static void main(String[] args) throws IOException {
     //创建对象
        ServerSocket ss = new ServerSocket(33333);
        //调用accept方法,监听客户端连接,返回一个socket(套接字)对象
        Socket s = ss.accept();
        //获取输入流,获取数据
        BufferedReader br =new BufferedReader(new InputStreamReader(s.getInputStream()));
        //输出数据
        BufferedWriter bw =new BufferedWriter(new FileWriter("day12\\s.txt"));
        String line;
        while ((line = br.readLine())!=null){
            bw.write(line);
          bw.newLine();
            bw.flush();
        }


        //给出反馈
        BufferedWriter bwserver = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        bwserver.write("文件上传成功了");
        bwserver.newLine();
        bwserver.flush();

        //关闭资源
        bw.close();
        ss.close();
    }

}
