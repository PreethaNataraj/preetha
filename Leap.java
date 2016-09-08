package preetha;

import java.util.Scanner;

public class Leap {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int y=s.nextInt();
		if(y%4==0)
		{
			System.out.println("Leap year");
		}
		else
		{
			System.out.println("Non leap year");
		}
	}

}
