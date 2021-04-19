class Average
{
	public static void main(String args[])
	{
		int n1,n2,n3,n4,n5;
		float avg;
		
		n1 = Integer.parseInt(args[0]);
		n2 = Integer.parseInt(args[1]);
		n3 = Integer.parseInt(args[2]);
		n4 = Integer.parseInt(args[3]);
		n5 = Integer.parseInt(args[4]);
		
		avg = (float)(n1+n2+n3+n4+n5)/2;
		System.out.println("The average of the 5 numbers is :" +avg);
	}
}