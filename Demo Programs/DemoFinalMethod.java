/*WAP to demonstrate fnal method in java*/
class TestFinalMethod
{
	final void show()
	{
		System.out.println("Final Method");
	}
	void display()
	{
		System.out.println("Non - Final method");
	}
}
class ChildclassFinalMethod extends TestFinalMethod
{
	/*void show() // overriding is not allowed as the base class method is final
	{
		System.out.println(" Child Final Method");
	}*/
	void display()
	{
		System.out.println("non final method with overriding");
	}
}
class DemoFinalMethod
{
	public static void main(String args[])
	{
		TestFinalMethod ob;//polymorphism
		ob = new TestFinalMethod();
		ob.show();
		ob.display();
		
		ob =  new ChildclassFinalMethod();
		//ob.show();
		ob.display();
	}
}