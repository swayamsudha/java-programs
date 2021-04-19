class Person
{
	int id;
	String Name,Gender,BloodGroup,Nationality;
	
	Person(int id,String Name,String Gender,String BloodGroup,String Nationality)
	{
		this.id=id;
		this.Name=Name;
		this.Gender=Gender;
		this.BloodGroup=BloodGroup;
		this.Nationality=Nationality;
	}
	
	void display()
	{
		System.out.println("I.D =" +id+  "\tNAME-: " +Name+  "\tGENDER-: " +Gender+  "\tBG-: " +BloodGroup+  "\tNATIONALITY-: " +Nationality);
	}
	
	public static void main(String args[])
	{
		Person p1 = new Person(120,"Swayam","Female","B+ve","Indian");
		Person p2 = new Person(140,"Shruti","Female","B+ve","Indian");
		Person p3 = new Person(120,"Harsita","Female","O+ve","Indian");
		Person p4 = new Person(140,"Robert","Male","B+ve","American");
		Person p5 = new Person(120,"Simon" ,"Male","O+ve","African");
		Person p6 = new Person(140,"Chris ","Female","B-ve","American");
		
		p1.display();
		p2.display();
		p3.display();
		p4.display();
		p5.display();
		p6.display();
	}
}