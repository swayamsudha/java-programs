class Arithmetic
{
	public static void main(String args[])
	{
		int num1=40 , num2 = 10;
		int add,div,mul,sub,mod;
		
		add = num1+num2;
		sub = num1 - num2;
		mul = num1 * num2;
		div = num1 / num2;
		mod = num1 % num2;
		
		System.out.println("Addition of two numbers is: " +add);
		System.out.println("Subtraction of two numbers is: " +sub);
		System.out.println("Multiplication of two numbers is: " +mul);
		System.out.println("Division of two numbers is: " +div);
		System.out.println("Modulus of two numbers is: " +mod);
		
	}
}