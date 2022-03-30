import java.io.*;
import java.util.*;
import java.lang.*;
 
public class Main {
    public static void main(String[] args) {
        int n , rev=0;
        Scanner sc =new Scanner (System.in);
        System.out.print("Enter the number  : ");
        n= sc.nextInt();
        while(n>0){
            rev=rev*10+n%10;
            n=n/10;
        }
        System.out.println("Reverse Number : "+rev);
    }
}
 
