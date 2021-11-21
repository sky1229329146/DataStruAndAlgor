package UtilPack;

import java.util.Arrays;

public class MyArray {

    private int[] elements;
    public MyArray(){
        elements=new int[0];

    }
    public int size(){
        return elements.length;
    }
    public void add(int element)    {
        int[] newArr = new int[elements.length+1];
        for (int i = 0; i < elements.length; i++) {
            newArr[i]=elements[i];

        }
        newArr[elements.length]=element;
        elements = newArr;
    }
    //显示数组中的所有元素
    public void show(){
        System.out.println(Arrays.toString(elements));
    }
}
