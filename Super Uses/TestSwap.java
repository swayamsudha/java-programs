import java.util.Scanner;
class SwapBase
{
	Scanner sc1 = new Scanner (System.in);
	public int no1;
	public void input1()
	{
		System.out.println("Enter the 1st number:");
		no1 = sc1.nextInt();
	}
}
class DerivedSwap extends SwapBase
{
	Scanner sc2 = new Scanner (System.in);
	
	public int no2;
	public void input2()
	{
		System.out.println("Enter the 1st number:");
		no2 = sc2.nextInt();
	}
	
	public void display()
	{
		System.out.println("Number1 = " + no1 + " and  Number2 = " +no2);
	}
	public void swap()
	{
		no1 = no1 + no2;
		no2 = no1 - no2;
		no1 = no1 - no2; 
	}
	
}
class TestSwap
{
	public static void main(String args[])
	{
		DerivedSwap ob = new DerivedSwap();
		ob.input1();
		ob.input2();
		System.out.println("Before Swapping:");
		ob.display();
		ob.swap();
		System.out.println("After Swapping:");
		ob.display();
		
	}
}