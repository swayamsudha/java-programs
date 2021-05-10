/*WAP to demonstrate Final variable in java*/
class TestFinalVariable
{
	 int no =10;//final variable
	void show()
	{
		final int no = 20; //value of variable can not be changed
		System.out.println("Value of num is " +no);
	}
}
	class DemoFinal
	{
		public static void main(String args[])
		{
			TestFinalVariable ob = new TestFinalVariable();
			ob.show();
		}
	}
