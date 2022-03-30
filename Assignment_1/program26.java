import java.io.*;
import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
       
       String str,rev="";
        char ch;
        Scanner sc = new Scanner (System.in );
       
        System.out.print("Enter a string : ");
         str = sc.nextLine();
         
      System.out.println();
        for ( int i=0; i< str.length() ; i++ ){
            ch=str.charAt(i);
            rev=ch+rev;
        }
        if(str.equals(rev)){
             System.out.println(rev + " is palindrome");
        }
       else{
           System.out.println(rev + " is not a palindrome");
       }
       
    }
}
