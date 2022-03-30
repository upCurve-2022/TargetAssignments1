import java.io.*;
import java.lang.*;
import java.util.*;
 
public class Main {
    public static void main(String[] args) {
       int n;
        
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Enter a number : ");
        n = sc.nextInt();
        if(n%2==0){
            System.out.println ("\n" + n + " is even");
        }
        else{
            System.out.println ("\n" + n + " is odd");
        }
    }
}
