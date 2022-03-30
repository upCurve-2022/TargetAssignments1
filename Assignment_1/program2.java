import java.io.*;
import java.lang.*;
import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        int n , i , j ,k ;
        
        Scanner sc= new Scanner(System.in);
        
        n = sc.nextInt();
        for( i =1; i<=n ; i++)
        {
            for( j =i ; j<n; j++){
                System.out.print(" ");
            }
            for( k =i; k>0 ; k--){
                System.out.print("* ");
            }
            System.out.println();
        }
        
    }
}
