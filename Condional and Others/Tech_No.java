/**WAP TO CHACK NO TECHNO OR NOT**/

import java.util.Scanner;
class Tech_No
{
	public static void main(String args[])
	{
		int tech_no,num1,num2,num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the  4 digit Number:");
		tech_no = sc.nextInt();
		if(tech_no >= 1000 && tech_no <= 9999)
			System.out.println(+tech_no+ " is a four digit no.");
		else
			System.out.println(+tech_no+ " is not a four digit no.");
		
		num1 = tech_no / 100;
		num2 = tech_no % 100;
		
		num = (int) Math.pow((num1+num2),2);
		if(num == tech_no)
			System.out.println(+tech_no+ " is a tech no.");
		else
			System.out.println(+tech_no+ " is not a tech no.");
		
	}
}

