import java.util.Scanner;
class Find_ArmStrong
{
	int findres(int num)
	{
		int sum =0;
		while(num!=0)
		{
			int dg=num%10;
			sum = (int) (sum + Math.pow(dg,3));
			num/=10;
		}
		return sum;
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int n,res;
		System.out.println("Enter the number:");
		n = sc.nextInt();
		
		Find_ArmStrong as = new Find_ArmStrong();
		res = as.findres(n);
		
		if(n==res)
			System.out.println(+n+ " is an ARMSTRONG number..");
		else
			System.out.println(+n+ " is not an ARMSTRONG number..");
	}
}