import java.io.*;

class Electry_Rate
{
	public static void main(String args[]) throws IOException
	{
		int curr,prev,units;
		double rate;
		//InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //as is is the object of ISR so is can be written un place of new.....in
		System.out.println("Enter the current and previous units:");
		curr = Integer.parseInt(br.readLine());
		prev = Integer.parseInt(br.readLine());
		units = curr - prev;
		if(units <= 50)
			rate = units * 125;
		else if(units > 50 && units <= 100)
			rate = units*125 + (units - 100)*4.5;
		else if(units > 100 && units <= 200)
			rate = units * 125+100*4.5 + (units - 200)*6.0;
		else if(units > 200 && units <= 300)
			rate = units*125 + 100*4.5 + 200*6.0 + (units-300)*8.5;
		else 
			rate = units*125 + 100*4.5 + 200*6.0 + 300*8.5 + (units - 400)*10;
		
		System.out.println("Total rate = " +rate);
	}
}