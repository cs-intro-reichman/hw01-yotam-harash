/*
 * Write a program that gets a quantity of cents as a command-line argument.
 * The program prints how to represent this quantity using as many quarters as possible, plus the remainder in cents.
 */
public class Coins {
	public static void main(String[] args) {

		System.out.println("enter a number");
		int a = Integer.parseInt(args[0]);
		int b=a;
		int sum=b%25;
		int q=b-(sum*25);
		System.out.println("% Java Coins "+ a);
		System.out.println("Use " + sum + " quarters and " + q + "cents" );

		
	}
}