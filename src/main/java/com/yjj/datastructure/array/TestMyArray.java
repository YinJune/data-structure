package com.yjj.datastructure.array;

/**
 * @author: YinJunJie
 * @date: 2020/1/14 11:16
 * @description:
 */
public class TestMyArray {

    public static void main(String[] args) {
        MyArray myArray=new MyArray();
        System.out.println(myArray.size());
        myArray.add(1);
        System.out.println(myArray.size());
        myArray.add(2);
        myArray.add(3);
        myArray.add(4);
        myArray.show();
        myArray.delete(0);
        myArray.show();
        System.out.println(myArray.get(0));
        System.out.println("-------------");
        myArray.insert(2,99);
        myArray.show();
    }

}
