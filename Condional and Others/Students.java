/*WAP to implement inheritance in java*/
class Members
{
	float mark = 240;
}
class Students extends Members
{
	int age = 20; 
	public static void main(String args[])
	{
		Students p = new Students();
		System.out.println("Mark of student is " +p.mark);
		System.out.println("age of student is " +p.age);
	}
}