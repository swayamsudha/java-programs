import java.util.Scanner;
class Left_Rotation
{
	public static void main(String args[])
	{	
		int temp,i;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of Array:");
		int size=sc.nextInt();
		
		int[] intArray=new int[size];
		System.out.println("Enter the Array Elements:");
		for( i=0;i<size;i++)
			intArray[i]=sc.nextInt();
		
		System.out.println("Array Elements are:");
		for(i=0;i<size;i++)
		{
			System.out.println(intArray[i]);
		}
		System.out.println("How many times you want to rotate:");
		int rot = sc.nextInt();
		for (int k=0;k<rot;k++)
		{
			temp = intArray[0];
			for ( i=0;i<size-1;i++)
			{
				intArray[i]=intArray[i+1];
			}
			intArray[i] =  temp;
		}
		System.out.println("After left rotation Array elements are:");
		for ( i=0;i<size;i++)
		{
			System.out.println(intArray[i]);
		}
	}
}