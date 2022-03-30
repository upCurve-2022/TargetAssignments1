import java.lang.*;
import java.io.*;
import java.util.*;


public class Main {
    
    public static void main(String[] args) {
        
        int n, i ;
        
        Scanner sc = new Scanner( System.in );
        
        System.out.print("Enter the value of n : ");
        
        n = sc.nextInt();
        
        for( i= 1; i<= n ; i++)
        {
            System.out.print((2*i)*(2*i)+" ");
        }
    }
}
