import java.util.*;
import java.io.*;
import java.lang.*;

public class Main
{
    public static void main( String [] args){
        Scanner sc=new Scanner(System.in);
        String str,strU;
        System.out.print("Enter a String : ");
        str=sc.nextLine();
        strU=str.toUpperCase();
        System.out.println("\nOriginal : "+str);
        System.out.println("After : "+strU);
    }
}