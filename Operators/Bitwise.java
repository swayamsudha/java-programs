class Bitwise
{
	public static void main(String args[])
	{
		int num1=60 , num2 = 13;
		int and,or,xor,rs,ls;
		
		and = num1 & num2;
		or = num1 | num2;
		xor = num1 ^ num2;
		rs = num1 >> num2;
		ls = num1 << num2;
		
		System.out.println("Result of two numbers is: " +and);
		System.out.println("Result of two numbers is: " +or);
		System.out.println("Result of two numbers is: " +xor);
		System.out.println("REsult of two numbers is: " +rs);
		System.out.println("RESult of two numbers is: " +ls);
		
	}
}