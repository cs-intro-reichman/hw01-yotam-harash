/*
 * Solves linear equations of the form a⋅x + b = c.
 * The program gets a, b, and c as command-line arguments,
 * computes x, and prints the result.
 * Treats the three arguments as well as the computed value as double values
 */
public class LinearEq {

	public static void main(String[] args){

		
		double first = Integer.parseInt(args[0]);
        double sec = Integer.parseInt(args[1]);
		double three = Integer.parseInt(args[2]);
		System.err.println("% java LinearEq "+ first + " "+ sec +" "+ three );
		System.out.println(first + " * x + " + sec + " = " + three);
		double x= (three-sec)/first;
		System.out.println("x = " + x);
	}
		
	
}