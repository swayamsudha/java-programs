import java.util.Scanner;
class Grade_Student
{
	public  static void main(String args[])
	{
		float math,phy,chem,t_mark; 
		String name_1,name_2,name_3,name_4,name_5;
		int choose;
		//char gd;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the marks of the candidate:");
		math = sc.nextFloat();
		phy = sc.nextFloat();
		chem = sc.nextFloat();
		//bio = sc.nextFloat();
		t_mark = math + phy + chem ;
		System.out.println("Total mark =" +t_mark);
		System.out.println("Enter the students names:");
		name_1 = sc.nextLine();
		name_2 = sc.nextLine();
		name_3 = sc.nextLine();
		name_4 = sc.nextLine();
		name_5 = sc.nextLine();
		
		//gd = sc.next().charAt(0);
		
		
		/*if(t_mark >= 400)
			System.out.println("O grade");
		else if (t_mark >=300 && t_mark < 400)
			System.out.println("A grade");
		else if (t_mark >= 200 && t_mark < 300) 
				System.out.println("B grade.");
		else
			System.out.println("C grade!");*/
		
		System.out.println("choose 1 for 1st student:");
		System.out.println("choose 2 for 2nd student:");
		System.out.println("choose 3 for 3rd student:");
		System.out.println("choose 4 for 4th student:");
		System.out.println("choose 5 for 5th student:");
		choose = sc.nextInt();
		
		switch(choose)
		{
			case 1:
			System.out.println("Name -: " +name_1);
			System.out.println("Total mark = " +t_mark);
			break;
			//print("Grade = " +gd)
			
			case 2:
			System.out.println("Name -: " +name_2);
			System.out.println("Total mark = " +t_mark);
			break;
			//print("Grade = " +gd)
			
			case 3:
			System.out.println("Name -: " +name_3);
			System.out.println("Total mark = " +t_mark);
			break;
			//print("Grade = " +gd)
			
			case 4:
			System.out.println("Name -: " +name_4);
			System.out.println("Total mark = " +t_mark);
			break;
			//print("Grade = " +gd)
			
			case 5:
			System.out.println("Name -: " +name_5);
			System.out.println("Total mark = " +t_mark);
			break;
			//print("Grade = " +gd)
			
		}
		
	}
}