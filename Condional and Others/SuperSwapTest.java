class BaseSwap
{
	int no =10;
	/*void show()
	{
		System.out.println(no);
	}*/
}
class DerivedSwap extends BaseSwap
{
	int no =20;
	public void swap()
	{
		super.no = super.no + no;
		no = super.no - no;
		super.no = super.no - no; 
	}
	void show()
	{
		swap();
		System.out.println("no1 = " +no+ "no2 = " +super.no);
	}
	
}
class DerivedSwap2 extends DerivedSwap
{
	int no = 30;
	public void swap()
	{
		super.no = super.no + no;
		no = super.no - no;
		super.no = super.no - no; 
	}
	void display()
	{
		super.show();
		/*System.out.println("Derived = " );
		super.swap();
		System.out.println("no1 = " +super.no+ "no2 = " +no);*/
		
		System.out.println("Derived2 = " +no);
		swap();
		System.out.println("no1 = " +super.no+ "no2 = " +no);
	}
}
class SuperSwapTest
{
	public static void main(String args[])
	{
		DerivedSwap2 ob = new DerivedSwap2();
		 ob.display();
	}
}