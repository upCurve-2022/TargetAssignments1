import java.io.*;
import java.util.*;
public class Main {
     public static void main(String[] args) {  
         Scanner sc=new Scanner(System.in);
         System.out.print("Enter a string : ");
        String string1 = sc.nextLine();
        int count;  
        
        char string[] = string1.toCharArray();  
          
        System.out.println("\nDuplicate characters in a given string: ");  
        
        for(int i = 0; i <string.length; i++) {  
            count = 1;  
            for(int j = i+1; j <string.length; j++) {  
                if(string[i] == string[j] && string[i] != ' ') {  
                    count++;  
                    
                    string[j] = '0';  
                }  
            }  
            
            if(count > 1 && string[i] != '0')  
                System.out.println(string[i]);  
        }  
    }  
    
	
}
