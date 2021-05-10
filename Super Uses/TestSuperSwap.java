import java.util.Scanner;
class SwapSuperBase
{
	Scanner sc1 = new Scanner (System.in);
	int no;
	public void input1()
	{
		System.out.println("Enter the 1st number:");
		no = sc1.nextInt();
	}
	SwapSuperBase()
	{
		System.out.println("=========BASE SWAP=========");
	}
}
class DerivedSuperSwap extends SwapSuperBase
{
	Scanner sc2 = new Scanner (System.in);
	
	public int no;
	public void input2()
	{
		System.out.println("Enter the 2nd number:");
		no = sc2.nextInt();
	}
	
	public void display()
	{
		System.out.println("Number1 = " + super.no + " and  Number2 = " +no);
	}
	public void swap()
	{
		super.no = super.no + no;
		no = super.no - no;
		super.no = super.no - no; 
	}
	 DerivedSuperSwap()
	{
		System.out.println("=========Derived1 SWAP=========");
	}
}
class DerivedSuperSwap1 extends DerivedSuperSwap
{
	Scanner sc3 = new Scanner (System.in);
	int no;
	public void input3()
	{
		System.out.println("Enter the 3rd number:");
		no = sc3.nextInt();
	}
	
	public void display()
	{
		System.out.println("Number1 = " + super.no + " and  Number2 = " +no);
	}
	public void swap()
	{
		super.no = super.no + no;
		no = super.no - no;
		super.no = super.no - no; 
	}
	 DerivedSuperSwap1()
	{
		System.out.println("=========Derived3 SWAP=========");
	}
	public void swapSuper()
	{
		System.out.println("Before Swapping:");
		super.display();
		super.swap();
		System.out.println("After Swapping:");
		super.display();
	}
}
class TestSuperSwap
{
	public static void main(String args[])
	{
		DerivedSuperSwap1 ob = new DerivedSuperSwap1();
		ob.input1();
		ob.input2();
		ob.input3();
		ob.swapSuper();
		System.out.println("Before Swapping:");
		ob.display();
		ob.swap();
		System.out.println("After Swapping:");
		ob.display();
		
	}
}
