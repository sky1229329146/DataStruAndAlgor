package Sort;

import java.util.Arrays;

public class ShellSort {
    public static void main(String[] args) {
        int[] arr = new int[]{3,5,2,7,8,1,2,0,4,7,4,3,8};
        shellSort(arr);
        System.out.println(Arrays.toString(arr));

    }


    public static void shellSort(int[] arr){
        //遍历所有的步长
        for (int i = arr.length/2; i > 0 ; i /= 2) {
           //遍历所有的元素
            for (int j = i; j < arr.length; j++) {
                //遍历本组中所有的元素
                for (int k = j-i; k >=0 ; k-=i) {
                    //如果当前元素大于加上步长后的元素
                    if(arr[k]>arr[k+i]){
                        int temp=arr[k];
                        arr[k]=arr[k+i];
                        arr[k+i]=temp;

                    }

                }

            }

        }
    }

}
