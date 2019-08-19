package itheima02;

import java.io.*;

public class _04 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("day09\\src\\a.txt"));
        BufferedWriter bw =new BufferedWriter(new FileWriter("day09\\src\\t.txt"));
        //循环读写
        String line = null;
        while ((line=br.readLine())!=null){
          bw.write(line);
          bw.newLine();
          bw.flush();
        }
        bw.close();
        br.close();
    }
}
