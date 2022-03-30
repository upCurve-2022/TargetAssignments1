import java.io.*;
import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
       
       int i,n ,x,c=0;
        Scanner sc = new Scanner (System.in );
       int arr[]=new int[100];
        System.out.print("Enter the size of an array  : ");
         n = sc.nextInt();
        System.out.print("Enter the elements of an array  : ");
        for(i=0; i< n ; i++){
            arr[i]=sc.nextInt();
        }
        
      System.out.print("\nEnter the element to find :  ");
         x = sc.nextInt();
        
        for(i=0; i < n ; i++){
            if(x==arr[i]){
                c=1;
                break;
            }
        }
        if(c==1){
            System.out.println("\n"+x + " is present in  "+(i+1)+" postion");
        }
        else{
            System.out.println(x+ " is not present");
        }
       
    }
}
