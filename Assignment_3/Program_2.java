import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        final double pi=3.14;
        double radius, height,volume;
        System.out.print("Enter : \n\tRadius : ");
        radius= sc.nextDouble();
        System.out.print("\n\tHeight : ");
        height = sc.nextDouble();
        volume = pi * radius * radius * height ;
        System.out.println ("\nVolume : "+volume);
    }
}