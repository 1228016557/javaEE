package itheima02_digui;

import java.io.File;

/*
递归遍历目录
        案例需求
        ​	给定一个路径(E:\\itcast)，通过递归完成遍历该目录下所有内容，并把所有文件的绝对路径输出在控制台*/
public class DiGui03 {
    public static void main(String[] args) {
     //创建一个file对象
        File f =new File("E:\\aaa");
        getAllFilePath(f);

    }
public static void getAllFilePath(File f ){
        //获取f下的所有目录和文件
    File[] fileArray = f.listFiles();
     //如果该文件不为空
    if (fileArray!=null){
        //遍历fileArray
        for (File file : fileArray) {
           //如果file是目录
            if (file.isDirectory()){
               //递归调用
                getAllFilePath(file);
            }
            else {
                //获取绝对路径输出
                System.out.println(file.getAbsolutePath());
            }

        }
    }

    }
}
