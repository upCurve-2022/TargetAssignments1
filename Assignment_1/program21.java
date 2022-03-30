import java.io.*;
import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
       
        int  n , t=1,c;
        Scanner sc = new Scanner (System.in );
       
        System.out.print("Enter the value of N : ");
         n = sc.nextInt();
         System.out.print("\n"+t+" ");
        for(int i = 1; i<n ; i++){
            t=t+i*i;
            if(i%2!=0){
                c=-t;
            }
            else{
                c=t;
            }
            System.out.print(c+" ");
        }
       
    }
}
