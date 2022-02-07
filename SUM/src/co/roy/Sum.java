package co.roy;
import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a,b,sum;
		a=in.nextInt();
		b=in.nextInt();
		sum=a+b;
		System.out.println("Sum of "+a+" and "+b+" is: "+sum);
	}
}
