import java.io.*;
import java.util.*;
import java.lang.*;
 
public class Main {
    public static void main(String[] args) {
      int n1, n2, n3, largest , secondLargest;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers : ");
        n1=sc.nextInt();
        n2=sc.nextInt();
        n3=sc.nextInt();
        if(n1>n2 && n1>n3){
            largest = n1;
            if(n2>n3){
                secondLargest=n2;
            }
            else{
                secondLargest=n3;
            }
        }
        else if(n2>n3){
            largest=n2;
            if(n1>n3){
                secondLargest=n1;
            }
            else{
                secondLargest=n3;
            }
        }
        else{
            largest=n3;
            if(n1>n2){
                secondLargest=n1;
            }
            else{
                secondLargest=n2;
            }
        }
        System.out.println("\nLargest : "+largest);
        System.out.println("Second Largest : "+secondLargest);
    }
}
 
