/*
 * Three sides can form a triangle if the sum of the lengths of any two sides is greater than the length of the remaining side. 
 * This is known as the Triangle Inequality Theorem. 
 * Write a program that tests if three given integers form a triangle.
 */ 
public class Triangle {
	public static void main(String[] args) {
		
		boolean tri=false;
		double first = Integer.parseInt(args[0]);
        double sec = Integer.parseInt(args[1]);
		double three = Integer.parseInt(args[2]);
		tri= (first +sec>three) && (first +three>sec) && (three +sec>first);
		
		System.out.println(first+ " , "+ sec+" , "+ three + " : "+ tri);
		
	}
}
