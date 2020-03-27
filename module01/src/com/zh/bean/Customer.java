package com.zh.bean;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Date;

public class Customer extends Person{

    private static final int INITIAL_SIZE=10;
    private Date date;

    public Customer() {
    }

    public static void main(String[] args){

        System.out.println("Hello world!");
        getList();
        method1();
    }

    public static void getList() {
        ArrayList list = new ArrayList();
        list.add(0,"2");
    }

    //注释颜色设置
/*
    删除选中行 ctrl+D
    单行注释 ctrl+/
    多行注释 ctrl+shift+/
    向下复制 ctrl+alt+down
    向上移动行 alt+up
    向下移动行 alt+down
    向下开始新的一行 shift+enter
    向上开始新的一行 ctrl+shift+enter
    查看源码 ctrl+选中的结构/ctrl+shift+t
    万能纠错(依赖的添加)/生成返回值变量 alt+enter
    退回到前一个页面（back） alt+left
    前进到下一个页面（forward） alt+right
    查看继承关系（type hierarchy） Fn+F4

    格式化代码（reformat code） ctrl+shift+F
    提示方法参数类型（parameter info） ctrl+alt+/
    选中数行整体往后移动 TabC
    选中数行整体往前移动 shift+Tab
    查看类的结构 ctrl+O
    重构：修改变量名或方法名（rename） alt+shift+R
    大小写切换（toggle case） ctrl+shift+Y
    生成构造器/get/set/toString Fn+alt+Insert
    生成try catch等（surround with） alt+shift+Z
    局部变量抽取为成员变量（introduce field） alt+shift+F
    查找全局 ctrl+H
    查找文件 double+shift
    抽取方法 alt+shift+M
    最近修改的代码 ctrl+E
    关闭所有代码栏 ctrl+shift+W
    选择要粘贴的代码块 ctrl+shift+V
*/
    public static void method1(){
            System.out.println();
            System.out.println();
        Date date = new Date();
        int num;
        try {
            FileInputStream fileInputStream = new FileInputStream("hello.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
