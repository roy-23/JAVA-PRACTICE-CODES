//Using switch cases

package co.roy;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter an operator (+,-,*,/,%) : ");
		char ch=sc.next().trim().charAt(0);
		System.out.print("Enter two numbers : ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int ans=0;
		
//		switch(ch) {
//			case '+':
//				ans=a+b;
//				break;
//			case '-':
//				ans=a-b;
//				break;
//			case '*':
//				ans=a*b;
//				break;
//			case '/':
//				ans=a/b;
//				break;
//			case '%':
//				ans=a%b;
//				break;
//			default:
//				System.out.println("Invalid operator");
//		}
		//Advanced swith syntax
		switch(ch) {
		case '+'-> ans=a+b;
		case '-'->ans=a-b;
		case '*'->ans=a*b;
		case '/'->ans=a/b;
		case '%'->ans=a%b;
		default->System.out.println("Invalid operator");
		}
		System.out.println(ans);
	}
}
