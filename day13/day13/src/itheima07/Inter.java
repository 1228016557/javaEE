package itheima07;

public interface Inter {
    //抽取共性
    private static void gong(){
        System.out.println("执行中");
        System.out.println("执行中");
        System.out.println("执行中");
    }
    //两个默认方法
    default void show1() {
        System.out.println("show1执行了");
//        System.out.println("执行中");
//        System.out.println("执行中");
//        System.out.println("执行中");
        gong();
        System.out.println("show1执行了");
    }

    default void show2() {
        System.out.println("show2执行了");
//        System.out.println("执行中");
//        System.out.println("执行中");
//        System.out.println("执行中");
        gong();
        System.out.println("show2执行了");
    }

    //两个静态方法
    static void method1() {
        System.out.println("method1执行了");
//        System.out.println("执行中");
//        System.out.println("执行中");
//        System.out.println("执行中");
        gong();
        System.out.println("method1执行了");
    }

    static void method2() {
        System.out.println("method2执行了");
//        System.out.println("执行中");
//        System.out.println("执行中");
//        System.out.println("执行中");
        gong();
        System.out.println("method2执行了");
    }
}