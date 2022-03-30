import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
       int cost = 50 , discountP=12; 
        double discountPrice, finalCost;
        discountPrice= (double)cost * 12/100;
        finalCost=(double)cost-discountPrice;
        System.out.println("Original Price : $ "+cost+"\nDiscount Percentage : "+discountP +" %");
        System.out.println(" discount price : $  "+discountPrice + "\nFinal cost : $ "+finalCost);
    }
}