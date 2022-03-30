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
        System.out.print("\nEnter the elements of an array(sorted order)  : ");
        for(i=0; i< n ; i++){
            arr[i]=sc.nextInt();
        }
        
      System.out.print("\nEnter the element to find :  ");
         x = sc.nextInt();
        
        int low=0 , high=n-1,mid=(low + high)/2;
        while(high>=low){
            mid=(low + high)/2;
            if(x==arr[mid]){
                c=1;
                break;
            }
            else if(x<arr[mid]){
                high=mid-1;
                
            }
            else{
                low=mid+1;
            }
        }
        if(c==1){
            System.out.println("\n"+x + " is present in the array  ");
        }
        else{
            System.out.println(x+ " is not present in the array");
        }
       
    }
}
