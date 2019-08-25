package itheima10;

import java.io.*;
import java.net.Socket;

public class serverThread implements Runnable {
    private Socket s;

    public serverThread(Socket s) {
        this.s = s;
    }

    @Override
    public void run() {
            //接收数据,写到文本文件
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
            //新写的文件,防止名字重复
            int count=0;
            File file = new File("day12\\copy"+count+".txt");
              while (file.exists()){
                  count++;
                  file = new File("day12\\copy"+count+".txt");
              }

            //写文件
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
              String line;
              while ((line = br.readLine())!=null){
                  bw.write(line);
                  bw.newLine();
                  bw.flush();
              }
         //给出反馈
            BufferedWriter bw1 = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
              bw1.write("传输成功");
              bw1.newLine();
              bw1.flush();
              //释放资源
            s.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
