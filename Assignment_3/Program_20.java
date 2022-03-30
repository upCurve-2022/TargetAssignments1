import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
      String str="I am always ready to learn although I do not always like being taught.";
        String strM;
        System.out.print("Original string :  \n"+str);
       strM = str.replace('a','$');
       System.out.print("\n\nString after modification :  \n"+strM);
      
    }
}