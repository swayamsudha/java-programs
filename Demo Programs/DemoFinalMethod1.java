/*WAP to demonstrate the final clas in java*/
final class TestFinalmethod1
{
	void show()
	{
		System.out.println("Final method");
	}
	void display()
	{
		System.out.println(" Non Final method");
	}
} 
class DemoFinalMethod1
{
	public static void main(String args[])
	{
		TestFinalmethod1 ob = new TestFinalmethod1();
		ob.show();
		ob.display();
	}
}