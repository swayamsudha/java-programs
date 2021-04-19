import java.util.Scanner;

class Convert_Bin
{
	public static void main(String args[])
	{
		int bin,temp,d,s=0,p=0;
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter the number:");
		bin = sc.nextInt();
		temp = bin;
		while(bin != 0)
		{
			d = bin%10;
			s+=d*Math.pow(2,p);
			p++;
			bin /= 10;
			
		}
		System.out.println("The decimal form  of " +temp+ " is " +s );
	}
}