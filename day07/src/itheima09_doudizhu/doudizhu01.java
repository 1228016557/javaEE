package itheima09_doudizhu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

//斗地主
public class doudizhu01 {
    public static void main(String[] args) {
        //创建hashMap集合,用来存储键值和牌
        HashMap<Integer, String> map = new HashMap<>();
        //创建arraylist集合,用来存储键值(便于操作)
        ArrayList<Integer> arr = new ArrayList();
        //创建花色和牌数的数组
        String[] colors = {"♥", "♣", "♠", "♦"};
        String[] number = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        //用来记忆键值
        int index = 0;
        //用嵌套增强for循环把花色和数拼接到一起(52张牌)
        for (String color : colors) {
            for (String num : number) {
                map.put(index, color + num);
                arr.add(index);
                index++;
            }
        }
        //添加大小王
        map.put(index, "小王");
        arr.add(index);
        index++;
        map.put(index, "大王");
        arr.add(index);
        //洗牌Collections中的shuffle方法(打乱顺序)
        Collections.shuffle(arr);
        //创建结合Tree(自带排序),当底牌和三个玩家
        TreeSet<Integer> one = new TreeSet<>();
        TreeSet<Integer> two = new TreeSet<>();
        TreeSet<Integer> three = new TreeSet<>();
        TreeSet<Integer> dipai = new TreeSet<>();
        //发牌
        for (int i = 0; i < arr.size(); i++) {
            //获取牌键值
            Integer x = arr.get(i);
            if (i > arr.size() - 3) {
                dipai.add(x);
            }
            if (i % 3 == 0) {
                 one.add(x);
            }if (i%3==1){
                two.add(x);
            }if (i%3==2){
                three.add(x);
            }
        }
         //获取值,创建一个看牌的方法lookpoker
        lookpoker("红瞳",one,map);
        lookpoker("黑瞳",two,map);
        lookpoker("塔兹米",three,map);
        lookpoker("底牌",dipai,map);



    }
    public static void lookpoker(String name,TreeSet keyset,HashMap map){
        System.out.println(name+"的牌是:");
        for (Object key : keyset) {
            Object value = map.get(key);
            System.out.print(value+" ");
        }
        System.out.println();
    }
}
