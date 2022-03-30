import java.io.*;
import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
       
       int n , t,a=0;
        Scanner sc = new Scanner (System.in );
       
        System.out.print("Enter a three digit number  : ");
         n = sc.nextInt();
         
      System.out.println();
        t=n;
        while(t>0){
            a=a+(int) Math.pow(t%10,3);
            t=t/10;
        }
        if(a==n){
            System.out.println(a + " is armstrong number ");
        }
        else{
            System.out.println(a + " is not anarmstrong number ");
        }
       
    }
}
