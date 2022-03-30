import java.lang.*;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        int n, fact=1;
        Scanner sc = new Scanner (System.in );
        System.out.print("NUMBER : ");
        n=sc.nextInt();
        for(int i=1; i<=n ; i++){
            fact=fact*i ;
        }
        
        System.out.print("\nFACTORIAL : "+fact);
    }
}

