package day01_00_practice.notebookDemo;
/*
        键盘类: 键盘类，要符合USB接囗
 */
public class jianpan implements USB{
    @Override
    public void open() {
        System.out.println("键盘连接了");
    }

    @Override
    public void colse() {
        System.out.println("键盘断开了");
    }
}
