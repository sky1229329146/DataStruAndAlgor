

import java.util.Scanner;

public class InterviewTest {

    public static void main(String[] args) {

        System.out.println("请输入整数M");
        Scanner input = new Scanner(System.in);
        int M = input.nextInt();

        if (M <= 1 || M >= 100) {

            System.out.println("ERROR");
        }else {
            boolean[] a = new boolean[100];
            for (int i = 0; i < a.length; i++) {
                a[i] = true;
            }


            int l = 100;
            int count = 0;
            int j = 0;
            while (l >=M  ) {
                if (a[j] == true) {
                    count++;
                    if (count == M) {
                        count = 0;
                        a[j] = false;
                        l--;
                    }
                }
                j++;
                if (j == 100) {
                    j = 0;
                }
            }
            for (int i = 0; i < 100; i++) {
                if (a[i] == true) {
                    System.out.println(Integer.toString(i+1));
                }

            }

        }
    }
}