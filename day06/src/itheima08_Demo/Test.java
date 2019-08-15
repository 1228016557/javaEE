package itheima08_Demo;

import java.util.Comparator;
import java.util.TreeSet;

//成绩排序
public class Test {
     public static void main(String[] args) {
         TreeSet<Student> t = new TreeSet<>(new Comparator<Student>() {
             @Override
             public int compare(Student o1, Student o2) {
                 int num = o2.getSum() - o1.getSum();
                 int num2  =num ==0 ? o1.getName().compareTo(o2.getName()):num;
                 return num2;
             }
         });

         t.add(new Student("张一",95,87));
         t.add(new Student("张二",75,98));
         t.add(new Student("张三",98,85));
         t.add(new Student("张四",85,74));
         for (Student student : t) {
             System.out.println(student.getName()+","+student.getChina()+","+student.getMath()+","+student.getSum());
         }
            /*
            张三,98,85,183
            张一,95,87,182
            张二,75,98,173
            张四,85,74,159
             */

     }
}
