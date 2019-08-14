package One;

public class Test02 {
    public static void main(String[] args) {


    try{
        int a = 1/0;
        System.out.println(a);
    }catch (ArithmeticException e){
        System.out.println("异常出现了");
    }finally {
        System.out.println("我会执行吗？");
    }
    System.out.println("程序结束");
}
}