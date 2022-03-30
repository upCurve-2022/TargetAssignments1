import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
       int value;
        char ch;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character : ");
        ch = sc.next().charAt(0);
        value=ch;
        System.out.println("\nASCII value of "+ch+" : "+value);
    }
}