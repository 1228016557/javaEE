package itheima09;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

/*
        - 案例需求
  - 编写一个程序，获取10个1-20之间的随机数，要求随机数不能重复，并在控制台输出
- 代码实现
 */
public class Demo {
    public static void main(String[] args) {
        Set<Integer> s = new TreeSet<>();

        Random r =new Random();

        while(s.size()<10){
            int i = r.nextInt(19)+1;
            s.add(i);
        }

        System.out.println(s);
    }
}
