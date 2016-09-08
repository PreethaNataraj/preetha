package preetha;

import java.util.Scanner;

public class Alphapet {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String x=s.next();
		char y=x.charAt(0);
		
		if(Character.isDigit(y))
		{
			System.out.println("string is non alphabet");
		}
		else
		{
			System.out.println("String id digit");
		}
			
			
		
		
	}

}
