package Demo1;

import java.util.Arrays;

public class TestArray {

    public static void main(String[] args) {

        int[] arr1 = new int[] {9,8,7};
        int length1 = arr1.length;
       System.out.println(Arrays.toString(arr1));

       int dst=6;
       int[] arr2 = new int[arr1.length+1];
        for (int i = 0; i < arr1.length; i++) {
            arr2[i]=arr1[i];

        }
                arr2[arr1.length]=dst;
        arr1=arr2;
        System.out.println(Arrays.toString(arr1));



    }

}
