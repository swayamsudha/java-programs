class Logical
{
	public static void main(String args[])
	{
		int num1=10 , num2 = 20;
		int and,or,not;
		if(num1 < num2 && num2 >10)
		{
			and = num1 + num2;
			System.out.println("result is : " +and);
		}
		if(num1 < 15 || num2 > 25)
		{
			or = num2-num1;
			System.out.println("result is :" +or);
		}
			
		if(num1 != num2)
		{
			not = num2;
			System.out.println("result is :" +not);
		}
			
				
	}
}