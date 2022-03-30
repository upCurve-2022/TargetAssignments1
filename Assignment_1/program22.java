import java.io.*;
import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
       
        int  n ,a=0,b=1,c;
        Scanner sc = new Scanner (System.in );
       
        System.out.print("Enter the value of N : ");
         n = sc.nextInt();
         System.out.print("\n"+a+" "+b+" ");
        for(int i = 2; i<= n ; i++){
            c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
            c=a+b;
        }
       
    }
}
