package preetha;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		int sum=0;
		Scanner s=new Scanner (System.in);
		int a=s.nextInt();
		
		for (int i = 0; i <=a; i++) 
		{
			
	        sum=sum+i;
			
		}
		System.out.println(sum);

	}

}
