package itheima00_practice;

import java.io.File;

/*
public String getAbsolutePath() 返回此抽象路径名的绝对路径名字符串
//        public String getPath() 将此抽象路径名转换为路径名字符串
 */
public class file {
    public static void main(String[] args) {
        File f =new File("day08\\src");
        //  public String getAbsolutePath() 返回此抽象路径名的绝对路径名字符串
        System.out.println(f.getAbsolutePath());//D:\IDEA_javaCode\javaEE\day08\src
//     public String getPath() 将此抽象路径名转换为路径名字符串
        System.out.println(f.getPath());//day08\src

    }}
