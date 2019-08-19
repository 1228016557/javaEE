package itheima01_File;

import java.io.File;
import java.util.Arrays;

/*
   判断功能:
   public   boolean isDirectory()测试此抽象路径名表示的File是否为目录
   public   boolean isFile()测试此抽象路径名表示的File是否为文件
   public   boolean   exists()测试此抽象路径名表示的File是否存在
   获取功能
   public   String getAbsolutePath()返回此抽象路径名的绝对路径名字符串
   public   String getPath()将此抽象路径名转换为路径名字符串
   public   String getName()返回由此抽象路径名表示的文件或目录的名称
   public   String[] list()返回此抽象路径名表示的目录中的文件和目录的名称字符串数组
   public   File[] listFiles()返回此抽象路径名表示的目录中的文件和目录的File对象数组
 */
public class File03 {
    public static void main(String[] args) {
        File f1 = new File("day08\\src");
//        public   boolean isDirectory()测试此抽象路径名表示的File是否为目录
        System.out.println(f1.isDirectory()); //true
//        public   boolean isFile()测试此抽象路径名表示的File是否为文件
        System.out.println(f1.isFile());  //false
//        public   boolean   exists()测试此抽象路径名表示的File是否存在
        System.out.println(f1.exists()); //true

 //        public   String getAbsolutePath()返回此抽象路径名的绝对路径名字符串
        System.out.println(f1.getAbsolutePath()); //D:\IDEA_javaCode\javaEE\day08\src
//        public   String getPath()将此抽象路径名转换为路径名字符串
        System.out.println(f1.getPath()); //day08\src
//        public   String getName()返回由此抽象路径名表示的文件或目录的名称
        System.out.println(f1.getName()); //src
        System.out.println("---------");

File f2 = new File("day07\\src");
//        public   String[] list()返回此抽象路径名表示的目录中的文件和目录的名称字符串数组
           String[] str1 = f2.list();
        for (String dir : str1) {
            System.out.println(dir); //              /*itheima00//itheima01_Map itheima02_bianli itheima03 itheima04 itheima05_qiantao itheima06 itheima07_Collections itheima08 itheima09_doudizhu*/System.out.println("-----------");
                                      //把多行合并成一行的快捷键ctrl+shirt+j
        }
        System.out.println("------------");
//        public   File[] listFiles()返回此抽象路径名表示的目录中的文件和目录的File对象数组
        File[] filess = f2.listFiles();
        for (File file : filess) {
            System.out.println(file);
            /*day07\src\itheima00 day07\src\itheima01_Map day07\src\itheima02_bianli day07\src\itheima03 day07\src\itheima04 day07\src\itheima05_qiantao day07\src\itheima06 day07\src\itheima07_Collections day07\src\itheima08 day07\src\itheima09_doudizhu*/
            //  System.out.println(file.getName());
      //判断输出文件
       if (file.isFile()){
           System.out.println(file.getName());
       }
        }

    }
}
