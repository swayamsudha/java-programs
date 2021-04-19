import java.io.*;
import java.util.Scanner;
public class BufferedReaderDemo
{
	static public void main(String args[]) throws InterruptedException, IOException 
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input is " + br.readLine() );
		
		System.out.println("Input is " + sc.nextLine() );
		
		
	}
}