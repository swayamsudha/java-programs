import java.util.Scanner;

class Convert_dec
{
	public static void main(String args[])
	{
		int dec,t,d,bin=0,oct=0,i=1,ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the decimal number:");
		dec=sc.nextInt();
		
		System.out.println("choose  1 to Convert it to binary: \n2 for Convert it to Octal:");
		System.out.println("Enter the choice:");
		
		ch=sc.nextInt();
		switch(ch)
		{
			case 1:
				while(dec!=0)
				{
					d = dec % 2;
					bin = bin + (d*i);
					dec = dec /2;
					i*=10;
				}
				System.out.println("The binary conversion is = " +bin);
				break;
				
				case 2:
					while(dec!=0)
					{
						d = dec % 8;
						oct = oct + (d*i);
						dec = dec /8;
						i*=10;
					}
				System.out.println("The octal conversion is = " +oct);
				break;
				
				default:
				System.out.println("Not a valid input!!!");
		
		}
		
		
	}
	
}