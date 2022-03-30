import java.util.*;
public class Main
{
    
    public static void main(String[] args) 
    {
       
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the string: ");
        
        String s1=sc.nextLine();        
        
        System.out.println("Enter the string: ");
        
        String s2=sc.nextLine();
      if(s1.equals(s2)){
          System.out.println("Entered strings are equal");
      }
        else{
            System.out.println("Entered strings are not equal");
        }
              
    }
}