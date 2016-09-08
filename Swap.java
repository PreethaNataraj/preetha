package preetha;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("before swap");
		System.out.print("x=");
		int x=s.nextInt();
		System.out.print("y=");
		int y=s.nextInt();
		int temp=0;
		temp=x;
		x=y;
		y=temp;
		
		System.out.println("After Swap");
		System.out.print("x="+x);
		System.out.print("y="+y);
		
			
		}
			
			
		
		
	}


