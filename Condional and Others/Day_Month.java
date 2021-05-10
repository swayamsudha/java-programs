import java.util.Scanner;
class Day_Month
{
	public static void main(String args[])
	{
		int year,month;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year and the month:");
		year = sc.nextInt();
		month = sc.nextInt();
		if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12)
			System.out.println("Month contains 31 days..");
		else if((month==2) && (year %4==0 && year%100==0 && year%400==0))
			System.out.println("Month contains 29 days as it is a leap year..");
		else if(month == 2)
			System.out.println("Month contains 28 days..");
		else
			System.out.println("Month contains 30 days..");
			
	}
}