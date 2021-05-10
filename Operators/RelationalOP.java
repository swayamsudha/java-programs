class RelationalOP
{
	public static void main(String args[])
	{
		int num1=100,num2=5;
		boolean res;
		
		res = num1>=(200-100);
		System.out.println("Result: " +res);
		res = num2<=(40-38);
		System.out.println("RESult " +res);
		res = num1 > num2;
		System.out.println("big among the two numbers is: " +num1);
		res = num1<num2;
		System.out.println("small among two numbers is: " +num2);
		res=num1!=num2;
		System.out.println(" two numbers are not equal: ");
		
	}
}