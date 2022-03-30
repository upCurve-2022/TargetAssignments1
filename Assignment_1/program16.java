import java.lang.*;
import java.io.*;
import java.util.*;


public class Main {
    
    public static void main(String[] args) {
        
        int n, i ,t=1;
        
        Scanner sc = new Scanner( System.in );
        
        System.out.print("Enter the value of n : ");
        
        n = sc.nextInt();
        
        for( i=0; i<n ; i++)
        {
            t = t+ 4*i;
            
            System.out.print(t+" ");
            
        }
    }
}
