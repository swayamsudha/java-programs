import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class JvmTest
{
	public static void main(String args[])
	{
		Student s1 = new Student();
	
		Class c1 = s1.getClass();
		System.out.println(c1.getName());

		Method m[] = c1.getDeclaredMethods();
		for(int i=0; i<m.length; i++)
		{
			System.out.println(m[i].getName());
		}
		Field f[] = c1.getDeclaredFields();
		for(int i=0; i<f.length; i++)
		{
			System.out.println(f[i].getName());
		}
	}
} 

class Student
{
	private String name;
	private int rollNo;
	
	String getName()
	{
		return name;
	}
	/*private*/ void setName(String sName)
	{
		this.name = sName;
	}
	int getRollNo()
	{
		return rollNo;
	}
	/*private*/ void setRollNo(int sRollNo)
	{
		this.rollNo = sRollNo;
	}
}