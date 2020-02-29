public class MathematicalFunction{
	public static void main(String[] args){
	
		// Exponentiation
		System.out.println("4 raised to the power 2 : " + Math.pow(4,2));
		System.out.println("Eponent squared : " + Math.exp(2));
		System.out.println("Square root of 9 : " + Math.sqrt(9));
		System.out.println("Cube root of 27 : " + Math.cbrt(27));

		// Logarithms
		System.out.println("log of 2 : " + Math.log(2));
		System.out.println("log to the base 10 of 100 :" + Math.log10(100));

		// Trignometry
		System.out.println("sin(45) = " + Math.sin(Math.toRadians(45)));
		System.out.println("cos(45) = " + Math.cos(Math.toRadians(45)));
		System.out.println("tan(45) = " + Math.tan(Math.toRadians(45)));

		// Absolute value
		System.out.println("Absolute value of -2 : " + Math.abs(-2));
		System.out.println("Absolute valie of 2 : " + Math.abs(2));

		// Min Max value
		System.out.println("Maximum between 3 and 5 : " + Math.max(3,5));
		System.out.println("Minimun between 2 and 4 : " + Math.min(2,4));
	}
}
