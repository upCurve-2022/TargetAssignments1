import java.lang.*;
import java.io.*;
import java.util.*;


public class Main {
    
    public static void main(String[] args) {
        
        int n, i,t ;
        
        Scanner sc = new Scanner( System.in );
        
        System.out.print("Enter the value of n : ");
        
        n = sc.nextInt();
        
        for( i= 1; i<= n ; i++)
        {
            t = i;
            
            if( i % 2 != 0 ){
                t = -i;
            }
           
            
            System.out.print(t+" ");
        }
    }
}
