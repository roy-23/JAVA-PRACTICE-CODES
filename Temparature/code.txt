package co.roy;
import java.util.Scanner;

public class Temparature {
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		System.out.println("Enter temprature");
		float tempC=in.nextFloat();
		float tempF=(tempC * 9/5) +32;
		System.out.println(tempC+" deg Celcius = "+tempF+" deg Farenheit");
	}
}
