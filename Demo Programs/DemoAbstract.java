abstract class BaseAbstract
{
	abstract void show();
	void display()
	{
		System.out.println("Non abstract method");
	}
	BaseAbstract()
	{
		System.out.println("Constructor");
	}
}
class DerivedAbstract extends BaseAbstract
{
	void show() //overriding
	{
		System.out.println("abstract method Demo");
	}
}
class DemoAbstract
{
	public static void main (String args[])
	{
		BaseAbstract ob;
		ob = new DerivedAbstract();
		//ob.show();
		ob.display();
		ob.show();
	}
}

