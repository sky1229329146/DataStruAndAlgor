package UtilPack;

import java.util.Arrays;

public class DeleteElemnt {
    public static void main(String[] args) {
        int[] arr = new int[]{9,8,7,6,5,4};
        System.out.println(Arrays.toString(arr));
        //the index of element to be delete
        int dst=3;

        int[] newArr = new int[arr.length-1];

        for (int i = 0; i < newArr.length; i++) {
            if (i<dst) {
                newArr[i]=arr[i];
            }else {
                newArr[i]=arr[i+1];
            }
        }

        arr=newArr;

        System.out.println(Arrays.toString(arr));
    }
}
