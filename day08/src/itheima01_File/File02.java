package itheima01_File;

import java.io.File;
import java.io.IOException;

/*
public boolean createNewFile()当具有该名称的文件不存在时，创建一个由该抽象路径名命名的新空文件
public boolean mkdir()创建由此抽象路径名命名的目录
public boolean mkdirs()创建由此抽象路径名命名的目录，包括任何必需但不存在的父目录
 */
public class File02 {
    public static void main(String[] args) throws IOException {
     //   public boolean createNewFile()当具有该名称的文件不存在时，创建一个由该抽象路径名命名的新空文件
        File f1 = new File("e:\\aaa\\javase.txt");
        boolean file1 = f1.createNewFile();
        System.out.println(file1);  //第一次true,并且创建javase.txt文件
        //public boolean mkdir()创建由此抽象路径名命名的目录
        File f2 = new File("e:\\aaa\\asdwq");
        f2.mkdir();
        File f3 = new File("e:\\aaa\\javaweb\\html");
        f3.mkdirs();
    }
}
