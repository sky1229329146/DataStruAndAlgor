package UtilPack;

public class Febonacci {

    public static int values(int i) {
       if(i==1 || i==2 ) {
           return 1;
       }else {
           return values(i-1)+values(i-2);
       }

    }
}
