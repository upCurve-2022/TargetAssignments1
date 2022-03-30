import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
       int n1,n2,n3,l ;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers : ");
        n1 = sc.nextInt();
         n2= sc.nextInt();
         n3 = sc.nextInt();
        l=( (n1>n2) && (n1>n3) ) ? n1 : ((n2>n3) ? n2 :n3 );
        System.out.print("\nthe largest number is "+l) ;
      
    }
}