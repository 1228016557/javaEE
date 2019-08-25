package itheima02;
/*
案例需求
启动一个线程，在控制台输出一句话：多线程程序启动了
 */
public class MyRunableDemo {
    public static void main(String[] args) {
            //方式一
         MyRunable my = new MyRunable();
         Thread t = new Thread(my);
         t.start();
         //方法二
        new Thread(new MyRunable(){
            @Override
            public void run() {
                super.run();
            }
        }).start();
        //方法三
        new Thread(()->{
            System.out.println("多线程启动了");
        }).start();
        //省略格式
        new Thread(()-> System.out.println("多线程启动了")).start();
    }
}
