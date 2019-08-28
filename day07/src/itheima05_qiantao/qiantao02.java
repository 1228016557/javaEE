package itheima05_qiantao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
    案例需求
- 创建一个HashMap集合，存储三个键值对元素，每一个键值对元素的键是String，值是ArrayList
- 每一个ArrayList的元素是String，并遍历。
 */
public class qiantao02 {
    public static void main(String[] args) {
        //创建hashMap集合
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        //创建ArrayList集合
        ArrayList<String> arr1 = new ArrayList<>();
        arr1.add("塔兹米");
        arr1.add("红瞳");
        //创建ArrayList集合
        ArrayList<String> arr2 = new ArrayList<>();
        arr2.add("鸣人");
        arr2.add("佐助");
        //创建ArrayList集合
        ArrayList<String> arr3 = new ArrayList<>();
        arr3.add("宝儿姐");
        arr3.add("张楚岚");
        //给hashMap集合添加元素
        map.put("斩赤红之瞳",arr1);
        map.put("火影忍者",arr2);
        map.put("一人之下",arr3);
        //用entrySet()方法获取所有的键值和值
        Set<Map.Entry<String, ArrayList<String>>> entrySet = map.entrySet();
        //增强for
        for (Map.Entry<String, ArrayList<String>> entry : entrySet) {
            //获取键值
            String key = entry.getKey();
            //获取值
            ArrayList<String> value = entry.getValue();
            //输出动漫名称
            System.out.println(key);
            //增强for
            for (String name : value) {
                //输出主人公名字
                System.out.println("\t"+name);
            }
        }
    }}
