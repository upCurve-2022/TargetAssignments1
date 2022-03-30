import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
       int n;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an year : ");
        n = sc.nextInt();
      
        if( (n%4==0) || (n%400==0)){
            System.out.println("\n"+n+" is a leap year");
        }
        else{
            System.out.println("\n"+n+" is not a leap year");
        }
    }
}