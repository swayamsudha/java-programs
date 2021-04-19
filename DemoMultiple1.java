/* How to achieve to multiple inheritance in java  with same method name*/
interface BaseMultiple11
{
	void show();
}
interface BaseMultiple21
{
	void show();
}
class ChildMultiple1 implements BaseMultiple11,BaseMultiple21
{
	public void show()
	{
		System.out.println("Base1 and Base2");
	}
	public void show()
	{
		System.out.println("Base1 and Base2 override");
	}
}
class DemoMultiple1
{
	public static void main(String args[])
	{
		ChildMultiple1 ob = new ChildMultiple1();
		ob.show();
	}
}