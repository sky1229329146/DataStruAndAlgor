package Demo1;

import java.util.Arrays;

public class TestSearch {
    public static void main(String[] args) {
        //目标数组
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9};
        //记录开始位置
        int begin=0;
        //记录结束位置
        int end=arr.length-1;
        //记录中间位置
        int mid=(begin+end)/2;

        //目标元素
        int target=4;
        //记录目标位置
        int index=1;


        while (true){
            if(arr[mid]==target){
                index=mid;
                break;
            }else {
                //判断中间这个元素是不是比目标元素大
                if(arr[mid]>target){
                    //结束位置调整为前一个位置
                    end=mid-1;
                }else{
                    //中间的元素比目标元素小
                    begin=mid+1;
                }
                //取出新的中间位置
                mid=(begin+end)/2;
            }
        }
        System.out.println("index:"+index);
        System.out.println((arr[index]));
    }
}
