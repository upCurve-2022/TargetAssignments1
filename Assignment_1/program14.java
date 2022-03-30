import java.lang.*;
import java.io.*;
import java.util.*;


public class Main {
    
    public static void main(String[] args) {
        
        int n, i,a=1,b=4 ,c=7, d ;
        
        Scanner sc = new Scanner( System.in );
        
        System.out.print("Enter the value of n : ");
        
        n = sc.nextInt();
        
        System.out.print(a+" " + b + " "+ c+ " ");
                

        for( i=3; i<n ; i++)
        {
            d = a+ b + c;
            
            System.out.print(d+" ");
            a = b ;
            b = c ;
            c=d;
        }
    }
}

