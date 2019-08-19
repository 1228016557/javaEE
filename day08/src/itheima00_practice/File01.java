package itheima00_practice;

import java.io.File;
import java.io.IOException;

/*
public boolean isDirectory() 测试此抽象路径名表示的File是否为目录
public boolean isFile() 测试此抽象路径名表示的File是否为文件
public boolean exists() 测试此抽象路径名表示的File是否存在
public String getAbsolutePath() 返回此抽象路径名的绝对路径名字符串
public String getPath() 将此抽象路径名转换为路径名字符串
public String getName() 返回由此抽象路径名表示的文件或目录的名称
public String[] list() 返回此抽象路径名表示的目录中的文件和目录的名称字符串数组
public File[] listFiles() 返回此抽象路径名表示的目录中的文件和目录的File对象数组
 */
public class File01 {
    public static void main(String[] args) throws IOException {
        //创建一个file对象
        File f1 =new File("D:\\IDEA_javaCode\\acc.txt");
        System.out.println(f1.createNewFile());
//        public boolean isDirectory() 测试此抽象路径名表示的File是否为目录
//        public boolean exists() 测试此抽象路径名表示的File是否存在
//        public boolean isFile() 测试此抽象路径名表示的File是否为文件
        System.out.println(f1.isDirectory());
        System.out.println(f1.exists());//true
        System.out.println(f1.isFile()); //true
//        public String getAbsolutePath() 返回此抽象路径名的绝对路径名字符串
//        public String getPath() 将此抽象路径名转换为路径名字符串
//        public String getName() 返回由此抽象路径名表示的文件或目录的名称
        System.out.println(f1.getAbsolutePath());  //D:\IDEA_javaCode\acc.txt
        System.out.println(f1.getPath());//D:\IDEA_javaCode\acc.txt
        System.out.println(f1.getName());//acc.txt
        System.out.println("------");
//        public String[] list() 返回此抽象路径名表示的目录中的文件和目录的名称字符串数组
//        public File[] listFiles() 返回此抽象路径名表示的目录中的文件和目录的File对象数组
        File f2 =new File("E:\\aaa");
        String[] list = f2.list();
        for (String str : list) {
            System.out.println(str);
        }
        System.out.println("-------");
        File[] files = f2.listFiles();
        for (File file : files) {
            System.out.println(file);
          if (file.isFile()){
              System.out.println(file.getName());
          }
        }
    }
}
