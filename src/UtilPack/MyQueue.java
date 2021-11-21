package UtilPack;

public class MyQueue {

    int[] elements;

    public MyQueue(){
        elements=new int[0];

    }

    //入队
    public void add(int element){
        //创建一个新的数组
        int[]   newArr = new int[elements.length+1];
        for (int i = 0; i < elements.length; i++) {
            newArr[i] = elements[i];
        }
        //把添加的元算放入数组中
        newArr[elements.length] = element;

        //把新数组传递给旧数组
        elements=newArr;
    }

    //出队

    public int  poll(){
        //取数组中第0个元素
        int element = elements[0];
        //创建一个新的数组
        int[] newArr = new int[elements.length-1];
        //复制原数组中的元素到新数组中
        for (int i = 0; i < newArr.length - 1; i++) {
            newArr[i]=elements[i+1];
        }
        //替换数组
        elements=newArr;

        return element;
    }

    //判断是否为空
    public boolean isEmpty(){
        return elements.length==0;
    }








}
