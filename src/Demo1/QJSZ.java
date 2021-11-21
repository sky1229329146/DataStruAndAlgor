package Demo1;

import sun.security.util.Length;

import java.util.Scanner;

public class QJSZ {
    public static void main(String[] args) {

        System.out.println("请输入一个正浮点数值");
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();

        int b = (int) a;

        if((a-b)>=0.5){
            b=(int)(a+0.5);
        }

        int rd = Math.round(b);

        System.out.println(b);
        System.out.println(rd);

    }
}
