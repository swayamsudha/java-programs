/*WAP to check principles of interface*/
interface BaseInterface
{
	public abstract void show();
	public abstract void display();
}
class Childclass implements BaseInterface
{
	public void show()
	{
		System.out.println(" show method");
	}
	public void display()
	{
		System.out.println("Display method");
	}
}
class DemoInterface
{
	public static void main(String args[])
	{
		BaseInterface ob;
		ob = new Childclass();
		ob.show();
		ob.display();
	}
}