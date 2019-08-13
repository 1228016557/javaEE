package itheima08;

import java.util.Scanner;

//测试类
public class Test {
    public static void main(String[] args) throws ScoreException {
           Teacher t = new Teacher();
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入分数");
        t.checkScore( sc.nextInt());
    }
}
