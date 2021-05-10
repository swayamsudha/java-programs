class X
{
	String name;
}
class Y extends X
{
	X show(String n)
	{
		name = n;
		return this;
	}
}
public class Demo
{
	public static void main(String args[])
	{
		Y ab1 = new Y();
		Y ab2 = (Y)ab1.show("Sai");
		System.out.println("Name is " + ab1.name + "\t" + " Name is " + ab2.name); 
	}
}