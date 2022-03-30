import java.lang.*;
import java.io.*;
import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        int n1, n2, temp;
        
        Scanner sc = new Scanner ( System.in );
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        System.out.print("Before : \n\tn1 : "+n1+"\n\tn2 : "+n2);
        temp = n1;
        n1=n2;
        n2= temp;
        System.out.print("\nAfter : \n\tn1 : "+n1+"\n\tn2 : "+n2);
    }
}
 
