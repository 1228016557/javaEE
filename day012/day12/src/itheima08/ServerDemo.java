package itheima08;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(9528);

        Socket s = ss.accept();
        //获取输入流,接收数据
        BufferedReader bf = new BufferedReader(new InputStreamReader(s.getInputStream()));
        //输出数据到文本
        BufferedWriter bw = new BufferedWriter(new FileWriter("day12\\s.txt"));
        String line;
        while ((line =bf.readLine())!=null){
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        bw.close();
        ss.close();
    }
}
