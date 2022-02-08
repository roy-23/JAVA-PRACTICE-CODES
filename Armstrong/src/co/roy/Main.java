package co.roy;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.print("Enter a number : ");
//		int n=sc.nextInt();
//		sc.close();
//		System.out.println(isArmstrong(n));
		printArmstrong();
		
	}
	
	static boolean isArmstrong(int n) {
		int sum=0;
		int orginal=n;
		while(n>0) {
			int rem=n%10;
			sum+=rem*rem*rem;
			n/=10;
		}
		return sum==orginal;
		
	}
	
	static void printArmstrong() {
		for(int i=100;i<1000;i++) {
			if(isArmstrong(i)) {
				System.out.println(i);
			}
		}
	}
}
