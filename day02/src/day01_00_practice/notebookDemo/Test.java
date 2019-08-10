package day01_00_practice.notebookDemo;
/*
定义笔记本身具备开机，关机和使用USB设备的功能。符合
USB规格的设备都可以。鼠标和键盘要想能在电脑上使用，
那么鼠标和键盘也必须守USB规范，不然鼠标和键盘
的生产出来无法使用；
进行描述笔记本类，实现笔记本使用USB鼠标、USB键盘
    USB接口，包含开启功能、关闭功能
    笔记本类，包含运行功能、关机功能、使用USB设备功能
    鼠标类，要符合USB接口
    键盘类，要符合USB接囗

 */
public class Test {
    public static void main(String[] args) {
        //创建对象(笔记本)
        Notebook n = new Notebook();
           n.kaiji();
           n.guanji();
           //创建对象(键盘,鼠标)
           jianpan j = new jianpan();
           shubiao s = new shubiao();


        //调用方法电脑usbopen接口,并且传参数
           n.usbopen(j);
           n.usbclose(j);
        //调用方法电脑usbclose接口,并且传参数
           n.usbopen(s);
           n.usbclose(s);
    }

}
