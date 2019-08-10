package day01_00_practice.notebookDemo;

import day01_00_practice._04.Use;

/*
        鼠标类:鼠标类，要符合USB接口
 */
public class shubiao implements USB {
    @Override
    public void open() {
        System.out.println("鼠标连接了");
    }

    @Override
    public void colse() {
        System.out.println("鼠标断开了");
    }
}
