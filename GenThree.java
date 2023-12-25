/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */



public class GenThree {
	public static void main(String[] args) {
		
        System.out.println("enter 3 numbers");
		    int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
			int max= Math.max(a, b);
			int min= Math.min(a, b);


            

            int num1 = (int)((Math.random() * (max -min + 1) + min));
            int num2 = (int)((Math.random() * (max -min + 1) + min));
            int num3 = (int)((Math.random() * (max -min + 1) + min));

            System.out.println(num1);
            System.out.println(num2);
            System.out.println(num3);

            int lowest = Math.min(Math.min(num1, num2), num3);
            System.out.println("The minimal generated number was " + lowest);
		
	}
}
