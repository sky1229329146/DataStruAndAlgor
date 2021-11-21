package Demo1;

import UtilPack.MyArray;

public class TestMyArray {
    public static void main(String[] args) {
        MyArray ma = new MyArray();
        System.out.println(ma.size());
        ma.show();
        //往可变数组添加元素
        ma.add(99);
        System.out.println(ma.size());

        ma.show();
    }
}
