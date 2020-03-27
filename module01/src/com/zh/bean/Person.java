package com.zh.bean;
import	java.util.ArrayList;

/**
 * @AUTHOR Zhu Hui
 * @CREATE 2020-03-26 15:35
 */
public class Person {

    //prsf
    private static final Customer CUSTOMER = new Customer();

    //psf
    public static final int NUM=10;

    //psfi
    public static final int NUMBER = 12;
    
    //年龄pric
    private int age;
    
    //姓名prsc
    private String name;
    

    public void eat(){
        System.out.println("吃饭");
    }

    //psvm
    public static void main(String[] args) {
        //sout
        System.out.println();
        //soutp
        System.out.println("args = [" + args + "]");
        //soutm
        System.out.println("Person.main");
        //soutv
        int num=0;
        System.out.println("num = " + num);
        //xxx.sout
        System.out.println(num);

        //fori
        String[] arr={"Tom","Jerry","Hanmeimei","Lilei"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        //iter
        for (String s : arr) {
            System.out.println(s);
        }
        //itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            
        }

        //list.for
        ArrayList<String> arrayList = new ArrayList<String> ();
        arrayList.add("a");
        arrayList.add("b");
        arrayList.add("c");
        for (String s : arrayList) {
            System.out.println(s);
        }
        //list.fori
        for (int i = 0; i < arrayList.size(); i++) {
            //正向遍历
        }
        //list.forr
        for (int i = arrayList.size() - 1; i >= 0; i--) {
            //逆向遍历
        }

        Integer number=0;
        //ifn
        if (number == null) {

        }
        //inn
        if (number != null) {
            
        }
        //xxx.null
        if (arrayList == null) {

        }
        //xxx.nn
        if (arrayList != null) {

        }


    }

    //自定义模板test
    public void testMethod(){

    }
}
