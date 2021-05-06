/*

* ASS - 7
* PERCENTAGE MARK
* 5.10.2020
 
*/
import java.util.Scanner;

interface Marks
{
    abstract float getPercentage();
}

class Student_A implements Marks 
{
    float eng;
    float math;
    float evs;
    
    Student_A(float eng, float math, float evs) 
	{
        this.eng  = eng;
        this.math = math;
        this.evs  = evs;
    }

    public float getPercentage() 
	{
        return (eng + math + evs) / 300f * 100;
    }
}

class Student_B implements Marks 
{
    float eng;
    float math;
    float evs;
    float cs;

    Student_B(float eng, float math, float evs, float cs) 
	{
        this.eng  = eng;
        this.math = math;
        this.evs  = evs;
        this.cs   = cs;
    }

    public float getPercentage() 
	{
        return (eng + math + evs + cs) / 400f * 100;
    }    
}

class Percentage_Student_Ass7 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
		float eng,math,evs,cs;
		
        System.out.println("\n==========STUDENT A============");
        
        System.out.print("English: ");
        eng = sc.nextFloat();
        System.out.print("Math: ");
        math = sc.nextFloat();
        System.out.print("EVS: ");
        evs = sc.nextFloat();

        Student_A ob = new Student_A(eng, math, evs);
		System.out.println("Percentage of student A = " +ob.getPercentage());
        System.out.println();
		
		System.out.println("\n==========STUDENT B============");
        
        System.out.print("English: ");
        eng = sc.nextFloat();
        System.out.print("Math: ");
		math = sc.nextFloat();
        System.out.print("EVS: ");
        evs = sc.nextFloat();
		System.out.print("CS: ");
        cs = sc.nextFloat();

        Student_B obj = new Student_B(eng, math, evs, cs);
		System.out.println("Percentage of student B = " +obj.getPercentage());
        System.out.println();
    }
}
