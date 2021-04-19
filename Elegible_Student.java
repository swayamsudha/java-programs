/*WAP TO FIND ELEGIBILITY OF A CANDIDATE FOR EXAMS*/

import java.util.Scanner;
class Elegible_Student
{
	public  static void main(String args[])
	{
		float math,phy,chem,bio,t_mark;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the marks of the candidate:");
		math = sc.nextFloat();
		phy = sc.nextFloat();
		chem = sc.nextFloat();
		bio = sc.nextFloat();
		t_mark = math + phy + chem + bio ;
		
		if(t_mark >= 150)
		{
			if(math > 30 && phy > 35)
			
				System.out.println("The candidate can appear the exam...");
				
			else if (chem+math+phy >= 100 )
				
				System.out.println("The candidate can appear the exam...");
				
			else if (bio >= 30 && chem >= 30) 
				
				System.out.println("The candidate can appear the exam...");
				
		}
		else
			System.out.println("The candidate can't appear the exam...");
		
	}
}