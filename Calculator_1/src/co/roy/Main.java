package co.roy;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);

		while(true) {
			System.out.print("Enter a operator (+,-,*,/,%) :");
			char ch=sc.next().trim().charAt(0);
			
			if(ch=='+' || ch=='-' || ch=='*' || ch=='/' || ch=='%') {
				System.out.print("Enter two numbers :");
				int a=sc.nextInt();
				int b=sc.nextInt();
				if(ch == '+') {
					System.out.println(a+b);
				}
				else if(ch=='-') {
					System.out.println(a-b);
				}
				else if(ch=='*') {
					System.out.println(a*b);
				}
				else if(ch=='/') {
					if(b!=0)
						System.out.println(a/b);
					else
						System.out.println("infinite");
				}
				else if(ch=='%') {
					System.out.println(a%b);
				}
			}
			else if(ch=='x' || ch=='X')
					break;
			else
				System.out.println("Invalid Input");
			

		}

	}
}
