package itheima04;
//void join()等待这个线程死亡
public class ThreadJoinDemo {
    public static void main(String[] args) throws InterruptedException {
        //创建对象
        ThreadJoin t1 = new ThreadJoin("康熙");
        ThreadJoin t2 = new ThreadJoin("八阿哥");
        ThreadJoin t3 = new ThreadJoin("四阿哥");
        //开启线程
        t1.start();
        //等待这个进程死亡
        t1.join();
        t2.start();
        t3.start();
    }
}
