package co.roy;

import java.util.Scanner;

public class Main_TRIM {
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//----trim removes extra spaces----//
		System.out.println(sc.next().trim());
		
		//-------char input---------//
//		char ch=sc.next().trim().charAt(0);
//		System.out.println(ch);
		
		//-----String input-------//
//		String word="hello";
//		System.out.println(word.charAt(0));
		
		
		
		sc.close();
	}
}
