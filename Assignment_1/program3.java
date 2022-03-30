import java.lang.*;
import java.io.*;
import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        int  principle, rateOfIntrest , timePeriod ,simpleIntrest;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter: \n\tPrinciple : ");
        principle = sc.nextInt();
        System.out.print("\n\tRate of Intrest : ");
        rateOfIntrest = sc.nextInt();
        System.out.print("\n\tTime Period : ");
        timePeriod = sc.nextInt();
        simpleIntrest =(principle*timePeriod*rateOfIntrest)/100;
        System.out.println("\nSimple Intrest : "+simpleIntrest);
    }
}
