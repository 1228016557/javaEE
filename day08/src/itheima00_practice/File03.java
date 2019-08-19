package itheima00_practice;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

//try..catch..finally
public class File03 {
    public static void main(String[] args) {
        OutputStream out =null;
        try {
            out = new FileOutputStream("day08\\src\\a.txt",true);
            out.write("hello world\r\n".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (out!=null){
                       out.close();}
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
