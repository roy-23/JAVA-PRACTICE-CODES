package co.roy;

import java.util.Scanner;

public class case_check {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char ch=sc.next().charAt(0);
		
		if(ch>='a' && ch<='z')
			System.out.println("Lowercase");
		else if(ch>='A' && ch<='Z')
			System.out.println("Uppercase");
		else
			System.out.println("Not an alphabet");
		
		sc.close();
	}
}
