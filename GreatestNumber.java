package preetha;

import java.util.Scanner;

public class GreatestNumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		int y=s.nextInt();
		int z=s.nextInt();
		if((x>y) &&(x>z))
		{
			System.out.println("x is largest number");
		}
		else
			if(y>z)
			{
				System.out.println("y is greatest number");
			}
			else
				System.out.println("z is greatest number");

	}

}
