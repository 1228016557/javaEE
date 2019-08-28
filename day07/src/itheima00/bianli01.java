package itheima00;
//遍历01
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
public class bianli01 {

    public static void main(String[] args) {
        //创建集合对象
        Map<String,String> map = new HashMap<>();
     //v put(K key,V value)将指定的值与该映射中的指定健相关联
        map.put("张无忌","赵敏");
        map.put("郭靖","黄蓉");
         map.put("杨过","小龙女");
         //遍历健的集合,获取每一个健的值
        Set<String> key = map.keySet();
      //增强for输出
        for (String s : key) {
            String value = map.get(s);
            System.out.println(s+"="+value);
        }
        System.out.println("-----------------");
        //迭代器
        Iterator<String> it = key.iterator();
        while (it.hasNext()){
            String key1 = it.next();
            String value = map.get(key1);
            System.out.println(key1+"="+value);

        }

    }}
