abstract class Bike1
{
		abstract void run();
}
class Honda42 extends Bike1
{
	void run()
	{
		System.out.println("Running safely");
	}
	public static void main(String args[])
	{
		Bike1 ob = new Honda42();
		ob.run();
	}
}