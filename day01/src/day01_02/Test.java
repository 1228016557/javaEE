package day01_02;

public class Test {
    public static void main(String[] args) {
        //创建对象,调用方法
        Zi z = new Zi();
        /*
        子类方法中访问一个变量
        子类局部范围找
        子类成员范围找
        父类成员范围找
        如果都没有就报错(不考虑父亲的父亲)
         */
        z.show();

    }
}
