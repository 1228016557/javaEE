package itheima02_Copy;

import java.io.*;

/*
复制文件夹
    数据源:E:\aaa
    数据目的:day10\src\aaa
  */
public class CopySrc01 {
    public static void main(String[] args) throws IOException {
      //数据源
        File  srcFolder = new File("e:\\aaa");
         //数据源的头文件
        String name = srcFolder.getName(); //aaa
        //数据目的
        File  dest = new File("day10\\src");
        //数据目的文件夹
           File destFoler = new File(dest,name);  //day10\src\aaa
       //创建文件夹(不会覆盖)
      destFoler.mkdirs();
      //获取数据源内的所有文件
        File[] srcfiles = srcFolder.listFiles();
      //遍历一次获取到每个文件
        for (File srcfile : srcfiles) {
            //获取源文件的文件名
            String names = srcfile.getName();
            //确定目的文件
            File destf = new File(destFoler,names);
            //复制文件
            copy(srcfile,destf);
        }

    }

    private static void copy(File src, File dest) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(src));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(dest));
        byte[] bys = new byte[1024];
        int len;
        while ((len=bis.read(bys))!=-1){
            bos.write(bys,0,len);
        }
        bos.close();
        bis.close();
    }
}
