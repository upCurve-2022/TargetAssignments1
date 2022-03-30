import java.lang.*;
import java.io.*;
import java.util.*;


public class Main {
  
    public static void main(String[] args) {
        
        int n, i=0,j ;
        int[] bin = new int[1000];
        Scanner sc = new Scanner( System.in );
        
        System.out.print("Decimal :  ");
        
        n = sc.nextInt();
   
        System.out.println();
       
        while( n> 0 )
        {
           bin[i++]=n%2;
           n=n/2;
        }
        System.out.println("Binary : ");
       for(j=i-1; j>=0 ; j--)
           System.out.print(bin[j]+" ");
        
            
        
    }
}
