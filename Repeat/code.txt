package Repeat;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number");
		int n=in.nextInt();
		int num=n;
		System.out.print("Enter which number's repeatation is to be calculated :");
		int r=in.nextInt();
		int count=0;
		while(n>0) {
			int rem=n%10;
			if(rem==r) {
				count++;
			}
			n=n/10;
		}
		System.out.println(r+" appeared "+count+" times in "+num);
	}
}
