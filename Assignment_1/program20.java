import java.io.*;
import java.util.*;
import java.lang.*;

class Main {
	static int binToDec(int n)
	{
		int num = n , dec_value = 0 , base = 1 , temp = num;
		while (temp > 0) {
			int last_digit = temp % 10;
			temp = temp / 10;

			dec_value += last_digit * base;

			base = base * 2;
		}

		return dec_value;
	}

	public static void main(String[] args)
	{
        int n;
        Scanner sc=new Scanner(System.in);
	
        n=sc.nextInt();
        
		System.out.println(binToDec(n));
	}
}
