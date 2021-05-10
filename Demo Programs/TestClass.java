interface In1
{
	final int a = 10;
	default void display()
	{
		System.out.println("Hello");
	}
}

class TestClass implements In1
{
	public static void main(String args[])
	{
		TestClass tc = new TestClass();
	
		tc.display();
	}
}