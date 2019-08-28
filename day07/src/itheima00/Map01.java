package itheima00;

import java.util.HashMap;
import java.util.Map;

//Map集合的基本使用
/*Map集合的特点

        - 键值对映射关系
        - 一个键对应一个值
        - 键不能重复，值可以重复
        - 元素存取无序*/
public class Map01 {

    public static void main(String[] args) {
        //创建集合对象
        Map<String,String> map = new HashMap<>();
     //v put(K key,V value)将指定的值与该映射中的指定健相关联
        map.put("张无忌","赵敏");
        map.put("郭靖","黄蓉");
        map.put("杨过","小龙女");

        //输出对象
        System.out.println(map);

    }}
