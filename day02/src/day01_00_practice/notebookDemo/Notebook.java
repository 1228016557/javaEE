package day01_00_practice.notebookDemo;
/*
          笔记本类，包含运行功能、关机功能、使用USB设备功能
 */
public class Notebook {



    //开机功能
    public void kaiji(){
        System.out.println("电脑开机了");
    }
    //关机功能
    public void guanji(){
        System.out.println("电脑关机了");
    }
    //usb接口功能
    public void  usbopen(USB usb){
        usb.open();
    }
    public void usbclose(USB usb){
        usb.colse();
    }

}
