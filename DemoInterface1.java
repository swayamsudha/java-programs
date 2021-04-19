/*WAP to check principles of interface*/
interface BaseInterface1
{
	public abstract void show();
	public abstract void display();
}
 abstract class Childclass1 implements BaseInterface1
{
	public void show()
	{
		System.out.println(" show method");
	}
		//abstract public void display();
}
 class Lastchildclass1 extends  Childclass1
{
	public void display()
	{
		System.out.println("Display method");
	}
}
class DemoInterface1
{
	public static void main(String args[])
	{
		BaseInterface1 ob;
		ob = new Lastchildclass1();
		ob.show();
		ob.display();
	}
}