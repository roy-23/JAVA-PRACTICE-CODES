package co.roy;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		System.out.println("Enter a Year");
		boolean a=true;
		while(a=true) {
			int year=in.nextInt();
			if(year%4==0) {
				if(year%100==0) {
					if(year%400==0) {
						System.out.println("Its a Leap Year");
					}
					else {
						System.out.println("Its not a leap year");
					}
				}
				else
					System.out.println("Its a Leap Year");	
			}
			else
				System.out.println("Its not a Leap Year");
			
			System.out.println("wanna enter more?(Y/N)");
			char c=in.next().charAt(0);
			if(Character.toUpperCase(c)=='N') {
				a=false;
				break;
			}
			else if(Character.toUpperCase(c)=='Y')
				System.out.println("Enter a Year");
			
			else {
				System.out.println("Invalid input");
				break;
			}
			
		}
	}
}
