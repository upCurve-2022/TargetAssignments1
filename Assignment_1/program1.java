import java.io.*;
import java.util.*;
import java.lang.*;
 
public class Main {
    public static void main(String[] args) {
        
        int n , i ;
        
        Scanner sc = new Scanner (System.in);
        n=sc.nextInt();
        for(i=1; i<=n ; i++ )
        {
            for(int j=i ; j>0 ; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
        
    }
}
