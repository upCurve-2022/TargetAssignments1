import java.lang.*;
import java.io.*;
import java.util.*;


public class Main {
    
    public static boolean isPrime(int n){
        for(int i=2 ; i<=n/2; i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        
        int n, m, i ,t=1;
        
        Scanner sc = new Scanner( System.in );
        
        System.out.print("Enter the range :\n\tn :  ");
        
        n = sc.nextInt();
        
        System.out.print("\n\tm : ");
        m = sc.nextInt();
        System.out.println();
        for( i=n ; i<=m ; i++)
        {
            if(isPrime(i)==true){
                System.out.print(n+" ");
            }
            
            
        }
    }
}
