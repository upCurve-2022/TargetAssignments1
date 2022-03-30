import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
       int n;
        double sqr;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        n = sc.nextInt();
       sqr=Math.sqrt(n);
        if((sqr- Math.floor(sqr))==0){
            System.out.println("\n"+n+" is a perfect square");
        }
        else{
            System.out.println("\n"+n+" is not a perfect square");
        }
    }
}