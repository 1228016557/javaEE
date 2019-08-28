package itheima01_Demo;

import java.io.*;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

/*
     1.1.1案例需求

- 键盘录入5个学生信息(姓名,语文成绩,数学成绩,英语成绩)。要求按照成绩总分从高到低写入文本文件
- 格式：姓名,语文成绩,数学成绩,英语成绩  举例：林青霞,98,99,100
 */
/*
    实现步骤:
    1. 定义学生类
2. 创建TreeSet集合，通过比较器排序进行排序
3. 键盘录入学生数据
4. 创建学生对象，把键盘录入的数据对应赋值给学生对象的成员变量
5. 把学生对象添加到TreeSet集合
6. 创建字符缓冲输出流对象
7. 遍历集合，得到每一个学生对象
8. 把学生对象的数据拼接成指定格式的字符串
9. 调用字符缓冲输出流对象的方法写数据
10. 释放资源
 */
public class Demo01 {
    public static void main(String[] args) throws IOException {
        //创建TreeSet集合,通过比较器排序进行排序
        TreeSet<Student> tree = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int num = o2.getSum() - o1.getSum();
                int num2 = num == 0 ? o2.getChinese() - o1.getChinese() : num;
                int num3 = num2 == 0 ? o2.getMath() - o1.getMath() : num2;
                int num4 = num3 == 0 ? o2.getName().compareTo(o1.getName()):num3;
                return num4;
            }
        });
        // 键盘录入学生数据
        for (int i = 0; i <5 ; i++) {
            Scanner sc =new Scanner(System.in);
            System.out.println("请输入姓名:");
            String name = sc.nextLine();
            System.out.println("请输入语文成绩:");
            int chinese = sc.nextInt();
            System.out.println("请输入数学成绩:");
            int math = sc.nextInt();
            System.out.println("请输入英语成绩:");
            int english = sc.nextInt();
            //创建学生对象，把键盘录入的数据对应赋值给学生对象的成员变量
            Student s = new Student();
            s.setName(name);
            s.setChinese(chinese);
            s.setMath(math);
            s.setEnglish(english);
           //把学生对象添加到TreeSet集合
                 tree.add(s);
        }
        //创建字符缓冲输出流对象
        BufferedWriter bw = new BufferedWriter(new FileWriter("day10\\src\\a.txt"));
//        遍历集合，得到每一个学生对象
        for (Student s : tree) {
            StringBuilder sb =new StringBuilder();
            // 把学生对象的数据拼接成指定格式的字符串
            sb.append(s.getName()).append(",").append(s.getChinese()).append(",").append(s.getMath()).append(",").append(s.getEnglish()).append(",").append(s.getSum());
            //      调用字符缓冲输出流对象的方法写数据
           bw.write(sb.toString());
            bw.newLine();
            bw.flush();
        }
//        10. 释放资源
   bw.close();

    }
}
