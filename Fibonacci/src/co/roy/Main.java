package co.roy;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int a=0,b=1,n,count=2;
		Scanner in=new Scanner(System.in);
		System.out.print("Enter which number element you want :");
		n=in.nextInt();
		while(count<=n) {
			int temp=b;
			b=b+a;
			a=temp;
			count++;
		}
		System.out.println(n+"th element is: "+b);
	}

}
