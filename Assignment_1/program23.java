import java.io.*;
import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
       
        int  n ,t1=1,t2=2;
        Scanner sc = new Scanner (System.in );
       
        System.out.print("Enter the value of N : ");
         n = sc.nextInt();
         System.out.print("\n1 -2 ");
        for(int i = 3; i<= n ; i++){
            if(i%2!=0){
                t1 = t1 +3;
                System.out.print(t1+" ");
            }
            else{
                t2=t2+4;
                System.out.print(-t2 + " ");
            }
        }
       
    }
}
