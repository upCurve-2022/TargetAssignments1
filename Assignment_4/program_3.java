import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner cs=new Scanner(System.in);
		String str;
		int count=0,in;
		System.out.println("Enter your String:");
		str=cs.nextLine();
		 for(in=0;in<str.length();in++)
		    {
		            if(str.charAt(in) >= '0' && str.charAt(in) <= '9')
		            {
		                  count++;
		            }
		    }
		    if(count==str.length())
		    	System.out.print("String contains only digits.");
		    else
		    	System.out.print("String does not contains only digits.");
		
		cs.close();
	}
}