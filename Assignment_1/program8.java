import java.io.*;
import java.util.*;
import java.lang.*;
 
public class Main {
    public static void main(String[] args) {
       int n, sumOdd=0, sumEven=0;
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter the N value : ");
        n=sc.nextInt();
        for(int i=0; i<=n ; i++){
            if(i%2==0){
                sumEven+=i;
            }
            else{
                sumOdd+=i;
            }
        }
        System.out.println("\nSum of Even Numbers from 0 to "+n+" : "+sumEven);
        System.out.println("\nSum of Odd Numbers from 0 to "+n+" : "+sumOdd);
        
    }
}
