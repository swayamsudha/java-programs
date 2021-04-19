import java.util.Scanner;
class Sin_Sum
{
	double num,fact,sum=0;
	int n,temp,sign=1,m=1;
	double findsinsum(int num,int n)
	{
		for(int i=1; i<=n; i++)
		{	
			temp =m;
			fact = 1;
			while(temp!=0)
			{
				fact*=temp;
				temp--;
			}
		sum += ((Math.pow(num,m)) / fact)*sign;
		sign*=(-1);
		m+=2;
		}
		return sum;
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of x:");
		int x = sc.nextInt();
		System.out.println("Enter the term:");
		int t = sc.nextInt();
		
		Sin_Sum ob = new Sin_Sum();
		double res = ob.findsinsum(x,t);
		System.out.println("Sum of sin series is %.2f" + res);
		
		
	}

}




