/*
	Menu Driven program on Queue using Abstarct class and abstract method..
*/

import java.util.Scanner;

abstract  class Queue
{
	abstract void insert();
	abstract void delete();
}
class DerivedQueue extends Queue
{
	public static int Queue[] = new int[30] ;
	public static int 	front =-1,rear = -1,size =5,item;
	
	void insert()			
	{	
		Scanner sc1 = new Scanner(System.in); 
		if(rear == size-1)
		{
			System.out.println("Queue Overflow!!!!");
		}
		else
		{
			if (front == -1)
			{
				front ++;
			}
			System.out.println("Enter the item to the queue for insert operation:");
			item = sc1.nextInt();
			rear++;
			Queue[rear] = item;
			System.out.println("The item " +item+ " is inserted successfully.. ");
		}
	}
	
	void delete()			
	{
		if((front == -1 ) | (front == rear+1))
		{
			System.out.println("Stack Underflow!!!!");
		}	
		else	
		{
			item = Queue[front];
			front++;
			System.out.println("The poped item is " + item);
		}
	}
	
	void display()		
	{
		if((front == -1 ) | (front == rear+1))
		{
			System.out.println("Stack Underflow!!!!");
		}	
		else
		{
			System.out.println("======Values of stack are:======");
			
			for(int i=front; i<=rear; i++)
			{
				System.out.println("\t\t " +Queue[i]);
			}
		}	
		
	}

}
class TestQueueAbstract
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		DerivedQueue dq = new DerivedQueue();
		
		while(true)
		{
			System.out.println("1.INSERT\n2.DELETE\n3.DISPLAY\n4.EXIT\n");
			int choice = sc.nextInt();
			switch(choice)
			{
				case 1: dq.insert();
						break;
						
				case 2: dq.delete();
						break;
						
				case 3:	dq.display();
						break;
						
				case 4:	System.exit(0);
				
				default:
					System.out.println("!!!!!!!Wrong Choice!!!!!!");
			}
		}
	}
}	