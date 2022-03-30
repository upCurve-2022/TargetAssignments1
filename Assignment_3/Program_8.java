import java.io.File;  
import java.io.IOException;  

public class Main {
    public static void main(String[] args) {
        File file = new File("C:\\demo\\sample.txt"); 
        boolean result; 
        try{
            result = file.createNewFile(); 
        if(result){
            System.out.println("file created "); 
            }  
        else  
            {  
            System.out.println("File not created ");  
            }    
        }
        catch (IOException e)   
            {  
            e.printStackTrace();   
        }        
        
    }
}