package preetha;

import java.util.Scanner;

public class Vowel {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String y=s.next();
		
		
		if((y.equalsIgnoreCase("a")) || (y.equalsIgnoreCase("e")) ||(y.equalsIgnoreCase("i")) || (y.equalsIgnoreCase("o")) || (y.equalsIgnoreCase("u")))
		{
			System.out.println("vowels");
		}
		else
		{
			System.out.println("consonent");
		}
	}

}
