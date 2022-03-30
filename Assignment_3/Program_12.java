import java.util.*;
import java.io.*;
import java.lang.*;

public class Main
{
    public static void main( String [] args){
        Scanner sc=new Scanner(System.in);
        String str1,str2,str3;
        System.out.print("Enter string 1: ");
        str1=sc.nextLine();
        System.out.print("\nEnter string 2: ");
        str2=sc.nextLine();
        str3=str1+" "+str2;
        System.out.println("\nString concatination : "+str3);
       
    }
}