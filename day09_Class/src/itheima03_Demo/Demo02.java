package itheima03_Demo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

//文件到集合
public class Demo02 {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new FileReader("day09\\src\\t.txt"));
        ArrayList<String> arr = new ArrayList<>();
        String line;
        while ((line=br.readLine())!=null){
            arr.add(line);
        }
        br.close();
        for (String s : arr) {
            System.out.println(s);
        }
    }
}
