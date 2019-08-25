package itheima08;

public class Demo {
    public static void main(String[] args) {
        //lambda
        usePrintable((i)->{
            System.out.println(i);  //666
        });
        //简化
        usePrintable(i-> System.out.println(i));   //666
        //方法引用
        usePrintable(System.out::println);    //666
    }
    private static void usePrintable(Printable p){
        p.printInt(666);
    }
}
