package itheima03_Demo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

//点名器
public class Demo03 {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new FileReader("day09\\src\\t.txt"));
        ArrayList<String> arr = new ArrayList<>();
        String line;
        while ((line=br.readLine())!=null){
            arr.add(line);
        }
        br.close();
        Random r =new Random();
        int index = r.nextInt(arr.size());

        String name = arr.get(index);

        System.out.println("幸运者是:"+name);


    }
}
