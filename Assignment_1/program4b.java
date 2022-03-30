import java.io.*;
import java.util.*;
import java.lang.*;
 
public class Main {
    public static void main(String[] args) {
        
        int n1 , n2, n3, temp ;
        
        Scanner sc = new Scanner (System.in ) ;
        
        n1= sc.nextInt();
        
        n2= sc.nextInt();
        
        n3= sc.nextInt();
        
        System.out.print("Before :\n\tn1 : "+ n1 + "\n\tn2 : " + n2 +"\n\tn3 : " + n3 );
        
        temp = n1;
        n1= n2;
        n2=n3;
        n3=temp;
        
        System.out.print("\nAfter :\n\tn1 : "+ n1 + "\n\tn2 : " + n2 +"\n\tn3 : " + n3 );
        
    }
}
 
