abstract class Bank
{
	abstract int getRateOfInterest();
}
class SBI extends Bank
{
	int getRateOfInterest()
	{
	return 7;
	}
}
class PNB extends Bank
{
	 int getRateOfInterest()
	{
		return 8;
	}
}
class TestBank
{
	public static void main (String args[])
	{
		Bank b = new SBI(); // instance of base class
		//b = new SBI();
		System.out.println("Rate of Interest is :" +b.getRateOfInterest()+"%");
		// Bank b = new PNB();
		System.out.println("Rate of Interest is :" +b.getRateOfInterest()+"%");
	}
		
}
