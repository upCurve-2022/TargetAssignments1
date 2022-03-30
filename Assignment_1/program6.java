import java.io.*;
import java.lang.*;
import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        float n,f;
        int w;
        Scanner sc = new Scanner ( System.in );
        System.out.print("Enter a number : ");
        n= sc.nextFloat();
        w=(int)n;
        f=(n-(float)w)*100;
        System.out.println("\nnumber : "+w+" " +(int)f);
    }
}
