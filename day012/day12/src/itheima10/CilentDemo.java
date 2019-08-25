package itheima10;

import java.io.*;
import java.net.Socket;

public class CilentDemo {
    public static void main(String[] args) throws IOException {
        //创建对象
        Socket s =new Socket("192.168.43.35",12345);
        //从文件中读取数据,接收数据
        BufferedReader br = new BufferedReader(new FileReader("day12\\a.txt"));
        //写数据
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        String line;
        while ((line = br.readLine())!=null){
            bw.write(line);
            bw.newLine();
            bw.flush();
        }

        //读取结束标语
        s.shutdownOutput();
        br.close();
        //接收反馈
        BufferedReader brclient  = new BufferedReader(new InputStreamReader(s.getInputStream()));
        //在控制台输出反馈
        String date = brclient.readLine();
        System.out.println("服务端的反馈:"+date);
      //释放资源
//        br.close();
        s.close();
    }
}
