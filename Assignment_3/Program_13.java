import java.util.*;
import java.io.*;
import java.lang.*;

public class Main
{
    public static void main( String [] args){
        Scanner sc=new Scanner(System.in);
        String str;
        int n;
        System.out.print("Enter some text : ");
        str=sc.nextLine();
        String[] ar=str.split(" ");
        n=ar.length;
        System.out.println("\nNumber of words  : "+n);
       
    }
}