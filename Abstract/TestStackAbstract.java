/*
	Menu Driven program on Stack using Abstarct class and abstract method..
*/

import java.util.Scanner;

abstract  class Stack
{
	abstract void push();
	abstract void pop();
}
class DerivedStack extends Stack
{
	public static int Stack[] = new int[30] ;
	public static int 	top =-1,size =5,item;
	
	void push()			
	{	
		Scanner sc1 = new Scanner(System.in); 
		if(top == size-1)
		{
			System.out.println("Stack Overflow!!!!");
		}
		else
		{
			System.out.println("Enter the item to the stack for push operation:");
			item = sc1.nextInt();
			Stack[++top] = item;
			System.out.println("The item " +item+ " is pushed successfully.. ");
		}
	}
	
	void pop()			
	{
		if(top == -1)
		{
			System.out.println("Stack Underflow!!!!");
		}	
		else	
		{
			item = Stack[top--];
			System.out.println("The poped item is " + item);
		}
	}
	
	void display()		
	{
		if(top == -1)
		{
			System.out.println("Stack Underflow!!!!");
		}	
		else
		{
			System.out.println("======Values of stack are:======");
			
			for(int i=top; i>=0; i--)
			{
				System.out.println("\t\t " +Stack[i]);
			}
		}	
		
	}

}
class TestStackAbstract
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		DerivedStack ds = new DerivedStack();
		
		while(true)
		{
			System.out.println("1.PUSH\n2.POP\n3.DISPLAY\n4.EXIT\n");
			int choice = sc.nextInt();
			switch(choice)
			{
				case 1: ds.push();
						break;
						
				case 2: ds.pop();
						break;
						
				case 3:	ds.display();
						break;
						
				case 4:	System.exit(0);
				
				default:
					System.out.println("!!!!!!!Wrong Choice!!!!!!");
			}
		}
	}
}	