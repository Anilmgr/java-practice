class LogicalExpressions{
	public static void main(String[] args){
		int x = 4, y=5;
		boolean a = true, b=false;
		
		//Comparative operators
		System.out.println("x is equal to: " + x);
        	System.out.println("y is equal to: " + y);

        	System.out.println("x is greater than y");
        	System.out.println(x > y);

        	System.out.println("x is less than y");
        	System.out.println(x < y);

        	System.out.println("x is greater than or equal to y");
        	System.out.println(x >= y);

        	System.out.println("y is less than or equal to y");
		System.out.println(y <= y);

        	System.out.println("x is equal to y");
        	System.out.println(x == y);

        	System.out.println("x is not equal to y");
        	System.out.println(x != y);

		//Boolean operators
		System.out.println("Value of a: " + a);
        	System.out.println("Value of b: " + b);

        	System.out.println("Boolean NOT of a");
        	System.out.println(!a);

        	System.out.println("Boolean AND of a and b");
       		System.out.println(a && b);

        	System.out.println("Boolean OR of a and b");
        	System.out.println(a || b);

        	System.out.println("Boolean exclusive XOR of a and b");
        	System.out.println(a ^ b);		
	
	}
}
