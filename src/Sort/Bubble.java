package Sort;

import SortFunction.BubbleSort;

import java.util.Arrays;

public class Bubble {

    public static void main(String[] args) {

        int[] b = {2,1,3,4,0};
        BubbleSort bt = new BubbleSort();
        System.out.println(Arrays.toString(b));
        bt.bubble(b);
        System.out.println(Arrays.toString(b));
    }
}
