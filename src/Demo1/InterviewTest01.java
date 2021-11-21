package Demo1;

import java.util.LinkedList;
import java.util.Scanner;

public class InterviewTest01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        LinkedList<Object> list = new LinkedList<>();

        int person = 100;
        for (int i = 0; i <=person; i++) {
            list.add(i);

        }
        int index = 0;
        while (list.size()>=m){
            index = (index+m-1)% list.size();
            list.remove(index);
        }
        System.out.println(list);
    }
}
