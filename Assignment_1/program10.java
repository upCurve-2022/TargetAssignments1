import java.io.*;
import java.util.*;
import java.lang.*;
 
public class Main {
    public static void main(String[] args) {
        int n , rev=0,t;
        Scanner sc =new Scanner (System.in);
        System.out.print("Enter the number  : ");
        n= sc.nextInt();
        while(n>0){
            rev=rev*10+n%10;
            n=n/10;
        }
        while(rev>0){
            t=rev%10;
            rev=rev/10;
            switch (t)
            {
                case 1: System.out.print("One ");
                    break;
                    
                    
                case 2: System.out.print("Two ");
                    break;
                    
                    
                case 3: System.out.print("Three ");
                    break;
                    
                    
                case 4: System.out.print("Four ");
                    break;
                    
                    
                case 5: System.out.print("Five ");
                    break;
                    
                    
                case 6: System.out.print("Six ");
                    break;
                    
                    
                case 7: System.out.print("Seven ");
                    break;
                    
                    
                case 8: System.out.print("Eight ");
                    break;
                    
                    
                case 9: System.out.print("Nine ");
                    break;
                    
                    
                case 0: System.out.print("Zero ");
                    break;
            }
        }
    }
