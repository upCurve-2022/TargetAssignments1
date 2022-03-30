import java.io.*;
import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
       
        int x, n ,p=1;
        Scanner sc = new Scanner (System.in );
       
        System.out.print("Enter\n\t X: ");
         x = sc.nextInt();
         System.out.print("\n\tN : ");
        n = sc.nextInt();
        for ( int i=1; i<= n ; i++ ){
            p=p*x;
        }
        System.out.println("\nSol : "+p);
       
    }
}
