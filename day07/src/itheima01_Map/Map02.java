package itheima01_Map;

import java.util.HashMap;
import java.util.Map;
/*
        Map集合的基本元素
    重点:    put();添加元素
             remove();根据键删除键值对元素
             get();根据键获取值
    知道:clear();移除键值对所有元素
         containkey();判断是否包含指定的键
         containsvalue();判断是否包含指定的值
         isEmpty();判断集合是否为空
         size();集合的长度,也就是键值的个数
 */
public class Map02 {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        //添加元素
        map.put(001,"鸣人");
        map.put(002,"佐助");
        map.put(003,"小樱");
        map.put(004,"雏田");
        System.out.println(map);  //{1=鸣人, 2=佐助, 3=小樱, 4=雏田}
        //remove();根据键删除键值对元素
        // map.remove(2);
        //System.out.println(map);   //{1=鸣人, 3=小樱, 4=雏田}
           //get();根据键获取值
            System.out.println(map.get(2));  //佐助
//            System.out.println(map.get("佐助"));  //null

//        clear();移除键值对所有元素
     /*     map.clear();
           System.out.println(map); //{}  */
//        containkey();判断是否包含指定的键
        System.out.println(map.containsKey(1)); // true
//        containsvalue();判断是否包含指定的值
        System.out.println(map.containsValue("佐助"));//true
//        isEmpty();判断集合是否为空
        System.out.println(map.isEmpty());  //false
//        size();集合的长度,也就是键值的个数
        System.out.println(map.size()); //4

    }
}
