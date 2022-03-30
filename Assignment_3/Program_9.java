import java.io.FileOutputStream;  

public class Main{  
    public static void main(String args[]){    
           try{    
             FileOutputStream fout=new FileOutputStream("D:\\sample.txt");    
             String s="Java is an object oriented programming language.";    
             byte b[]=s.getBytes();   
             fout.write(b);    
             fout.close();    
             System.out.println("Data is successfully written in the file.");    
            }catch(Exception e){System.out.println(e);}    
      }    
}  