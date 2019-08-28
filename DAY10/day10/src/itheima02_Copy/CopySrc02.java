package itheima02_Copy;

import java.io.*;

//复制多级文件夹
/*
1. 创建数据源File对象，路径是E:\\itcast
2. 创建目的地File对象，路径是F:\\
3. 写方法实现文件夹的复制，参数为数据源File对象和目的地File对象
4. 判断数据源File是否是文件
   ​	是文件：直接复制，用字节流
   ​	不是文件：
    		 在目的地下创建该目录
     		遍历获取该目录下的所有文件的File数组，得到每一个File对象
     		回到3继续(递归)
 */
public class CopySrc02 {
    public static void main(String[] args) throws IOException {
        //开头数据源:e:\aaa
        //开头数据目的 day10\
        File filestart = new File("e:\\aaa");
        File fileend = new File("day10");
        Copyfolder(filestart, fileend);


    }

    //复制文件夹
    private static void Copyfolder(File filestart, File fileend) throws IOException {
        if (filestart.isDirectory()) {
            //获取数据源文件的文件开头名
            String name = filestart.getName();
            //拼接出来数据目的第一个文件(数据目的第一个文件或者文件夹)
            File newfile = new File("day10", name);
            //创建文件夹
            newfile.mkdirs();
            //获取数据源中的所有目录
            File[] files = filestart.listFiles();
            //遍历
            for (File file : files) {
                //递归
                Copyfolder(file,newfile);
            }
        }else {
            //说明是文件，直接复制，用字节流
            File newFile = new File(fileend,fileend.getName());
            copyFile(filestart,newFile);

        }

    }
    private static void copyFile(File srcFile, File destFile) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcFile));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFile));

        byte[] bys = new byte[1024];
        int len;
        while ((len = bis.read(bys)) != -1) {
            bos.write(bys, 0, len);
        }

        bos.close();
        bis.close();
    }
}
