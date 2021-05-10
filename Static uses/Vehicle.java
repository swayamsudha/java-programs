import java.util.Scanner;
class Vehicle_Info
{
	String Chesis_No,Engine_no;
	static String Color;
	String Brand,Variant,Model;
	static 
	{	
		Color = "black";
	}
	 Vehicle_Info(String Chesis_No,String Engine_no,String Brand, String Variant, String Model,String C)
	{	
		this.Chesis_No = Chesis_No;
		this.Engine_no = Engine_no;
		this.Brand = Brand;
		this.Variant = Variant;
		this.Model = Model;
		//Color = C ;
	}
	
	void display()
	{	
		System.out.println("Chesis No = " +Chesis_No);
		System.out.println("Engine No = " +Engine_no );
		System.out.println("Colour = " +Color);
		System.out.println("Brand = " +Brand); 
		System.out.println("Variant = " +Variant); 
		System.out.println("Model = "  +Model);
	}
}
	class Vehicle
	  {
		public static void main(String args[])
		{
			Scanner sc = new Scanner (System.in);
			
			System.out.println("Chesis No: ");
			String Chesis_No = sc.next();
			
			System.out.println("Engine No: ");
			String Engine_no = sc.next();
			
			System.out.println("Brand: ");
			String Brand = sc.next();
			
			System.out.println("Model: ");
			String Model = sc.next();
			
			System.out.println("Colour: ");
			String Color = sc.next();
			
			System.out.println("Variant: ");
			String Variant = sc.next();
			
			Vehicle_Info v = new Vehicle_Info(Chesis_No,Engine_no,Brand,Variant,Model,Color);
			v.display();
		}
	}