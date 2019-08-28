package itheima00;
//Map镶嵌list
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class bianli03_qiantao02 {
    public static void main(String[] args) {
        //创建HashMap集合
        HashMap<String, ArrayList<String>> hm = new HashMap<String, ArrayList<String>>();

        //创建ArrayList集合，并添加元素
        ArrayList<String> sgyy = new ArrayList<String>();
        sgyy.add("诸葛亮");
        sgyy.add("赵云");
        //把ArrayList作为元素添加到HashMap集合
        hm.put("三国演义",sgyy);

        ArrayList<String> xyj = new ArrayList<String>();
        xyj.add("唐僧");
        xyj.add("孙悟空");
        //把ArrayList作为元素添加到HashMap集合
        hm.put("西游记",xyj);

        ArrayList<String> shz = new ArrayList<String>();
        shz.add("武松");
        shz.add("鲁智深");
        //把ArrayList作为元素添加到HashMap集合
        hm.put("水浒传",shz);

        //遍历hm,用keySet方法获取hm中的所有键值
        Set<String> keySet = hm.keySet();
        for (String name : keySet) {
            //用get方法获取值hm中的值
            ArrayList<String> arrayList = hm.get(name);
            //输出hm键值
            System.out.println(name);
            //for循环输出arraylist中的值
            for (String yuansu : arrayList) {
                System.out.println( "\t"+yuansu);
            }
        }
    }
}
