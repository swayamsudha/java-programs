/*Wap to find sum of 1st and last digit of a 5 digit number using command line arg*/

class Command_Sum
{
	public static void main(String args[])
	{
		int  num_digit = 5 ,sum ;
		int num, l, f ,div;
		
		
		num = Integer.parseInt(args[0]);
		System.out.println("The five-digit number is -: " +num);
		
		l = num % 10;
		div = (int)Math.pow(10,(num_digit-1));
		f = num / div;
		sum = l + f;
		
		System.out.println("The sum of !st and last figit of a Five-digit number is = " +sum);
	}
} 