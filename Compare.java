import java.util.Scanner;

class Floating_Int
 {
		 int a,b; // int typ temporary variable created
		 void compare(float x, float y) //function parameter float typ
		 {
			 a = (int)x; // type casting done for testing
			 b = (int)y;
			 
			 if(a != b)
			 {
				 if(a>b)
					 System.out.println(+a+ ">" +b);
				 else
					 System.out.println(+b+ ">" +a);
			 }
			 else
			 {
				float n1 = x*1000; //the floating parameter is multiplied by 1000 and stored in n1
				float n2 = y*1000;
				
				a = (int)n1; // float n1 is converted to int and stored in a
				b = (int)n2;
				System.out.println("After converting to int a = " +a+ " and b = " +b );
				
				if(a != b)
				{
					if(a>b)
					System.out.println(+a+ ">" +b);
					else
					 System.out.println(+a+ ">" +b);
				}
				else
					System.out.println(+a+ "=" +b);
			 }
			
		 }
		 
 }
 class Compare
 {
	 public static void main(String args[])
	 {
		 Scanner sc = new Scanner (System.in);
		 System.out.println("Enter the 1st number:");
		 float n1=sc.nextFloat();
		 System.out.println("Enter the 2nd number:");
		 float n2=sc.nextFloat();
		 
		 Floating_Int ob = new Floating_Int(); //object of the base class 
		 ob.compare(n1,n2); // method is called through the obj of base class
		 
	 }
 }