import java.util.Scanner;
class Test_Frequency
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of Array:");
		int size=sc.nextInt();
		
		int[] intArray=new int[size];
		System.out.println("Enter the Array Elements:");
		for(int i=0;i<size;i++)
			intArray[i]=sc.nextInt();
		
		System.out.println("Array Elements are:");
		for(int n:intArray)
			System.out.print(" "+n);
			
		int[] frequency=new int[size];
		for(int i=0;i<frequency.length;i++)
			frequency[i]=-1;
		//System.out.println("FREQUENCY : ");
		for(int i=0;i<frequency.length;i++)
		{
			int c=1;
			for(int j=i+1;j<frequency.length;j++)
			{
				if(intArray[i]==intArray[j])
				{
					c++;
					frequency[j]=0;
				}
			}
			if(frequency[i] != 0 )
			{
				frequency[i]=c;
			}
		}
		for(int i=0;i<frequency.length;i++)
		{
			if(frequency[i] != 0 )
			{
					System.out.println("Frequency of " +intArray[i]+ " is " +frequency[i]);
			}
		
		}
	
	}
	
}