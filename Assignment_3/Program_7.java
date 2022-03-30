import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
       int n ,i ,sum=0;
        int [] arr= new int[100];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array : ");
        n = sc.nextInt();
        System.out.print("\nEnter the elements of an array : ");
      for(i= 0 ;i <n; i++){
          arr[i]=sc.nextInt();
          sum = sum+arr[i];
      }
        System.out.println("\nAverge : " + sum/n);
    }
}