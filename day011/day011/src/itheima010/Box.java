package itheima010;

//定义奶箱类   奶箱类(Box)：定义一个成员变量，表示第x瓶奶，提供存储牛奶和获取牛奶的操作
public class Box {
    //定义奶箱中牛奶的数量
    private int milk;
    //定义一个变量用来确定奶箱的状态
    private boolean state = false;   //true有牛奶 ,flase没有牛奶

    //提供存储牛奶的方法
    public synchronized void put(int milk) {
        //首先判断奶箱中是否有牛奶
        if (state == true) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.milk = milk;
        System.out.println("运奶工把第" + milk + "瓶奶放入奶箱中");
        //生产完毕放入奶箱后修改奶箱的状态
//        state = false;
        state = true;

        //唤醒其他等待进程
        notify();
    }

    //提供获取牛奶的方法
    public synchronized void get() {
        //首先判断奶箱中是否有牛奶
        //如果没有牛奶,则等待
        if (state == false) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        this.milk = milk;
        System.out.println("运奶工把第" + milk + "瓶奶拿出奶箱中");

        //拿了最后的牛奶后,改变奶箱的状态
//        state = true;
        state = false;

        //唤醒其他等待进程
        notify();

    }
}
