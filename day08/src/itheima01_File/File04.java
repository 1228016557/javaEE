package itheima01_File;

import java.io.File;

//public boolean   delete()删除由此抽象路径名表示的文件或目录
//注意:1.只能删除目录里面没有文件的目录
          //2.删除时彻底删除,不经过回收站
public class File04 {
    public static void main(String[] args) {
        File f1 = new File("e:\\aaa\\java.txt");
        System.out.println(f1.delete());  //true 成功删除java.txt
      File f2 = new File("e:\\aaa\\asd");
        System.out.println(f2.delete()); //true成功删除asd文件夹
    }
}
