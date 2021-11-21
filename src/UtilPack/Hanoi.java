package UtilPack;

public class Hanoi {
    //当n>=2时，都简化为2个盘子

    //n 共有n个盘子，from 开始的柱子，in 中间的柱子，to 目标柱子
    public static void hanoi(int n,char from,char in,char to){
        if(n==1){
            System.out.println("第1个盘子从"+from+"移到"+to);
        }else{
            //移动上面所有的盘子到中间位置
            hanoi(n-1,from,to,in);
            //移动下面的盘子
            System.out.println("第"+n+"个盘子从"+from+"移到"+to);
            //把上面的所有的盘子从中间位置移动到目标位置
            hanoi(n-1,in,from,to);
        }
    }
}
