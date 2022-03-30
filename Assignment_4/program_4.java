import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
  public static void main(String[] args) {
   
    String str;
      Scanner sc=new Scanner (System.in);
    str= sc.nextLine();
    System.out.println("string is " + isNullEmpty(str));

  }

  public static String isNullEmpty(String str) {

    if (str == null) {
      return "NULL";
    }
    else if(str.isEmpty()){
      return "EMPTY";
    }
      else if (str.trim().isEmpty()){
      return "EMPTY";
    }

     else {
      return "neither NULL nor EMPTY";
    }
  }
}