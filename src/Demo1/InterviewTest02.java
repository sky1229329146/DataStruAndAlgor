package Demo1;

import java.util.Scanner;

public class InterviewTest02 {
    public static void main(String[] args) {
        System.out.println("请输入一个整数 1<=N<=100");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        boolean[] a = new boolean[100];
        for (int i = 0; i < a.length; i++) {
            a[i] = true;
        }


        for (int i =1; i <= N; i++) {
            int flag = 0;
            while(N%i==0)
            {


            }

        }
    }
}
