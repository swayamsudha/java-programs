/*Awt program to design frame of addition*/
import java.awt.*;
class Test_Awt
{
	Button b1,b2;
	TextField t1,t2,t3;
	Label lb1,lb2,lb3;
	Frame f;
	Test_Awt()
	{
		f = new Frame("Addition of two Numbers");
		lb1 = new Label("Enter First number");
		lb1.setBounds(5,50,150,30);
		f.add(lb1);
		
		t1 = new TextField();
		t1.setBounds(200,50,150,30);
		f.add(t1);
		
		lb2 = new Label("Enter second number");
		lb2.setBounds(5,80,150,30);
		f.add(lb2);
		
		t2 = new TextField();
		t2.setBounds(200,80,150,30);
		f.add(t2);
		
		b1 = new Button("+");
		b1.setBounds(170,140,50,20);
		f.add(b1);
		
		lb3 = new Label("Result");
		lb3.setBounds(5,200,150,30);
		f.add(lb3);
		
		b2 = new Button("=");
		b2.setBounds(100,250,100,30);
		f.add(b2);
		
		t3 = new TextField();
		t3.setBounds(200,200,150,30);
		f.add(t3);
		
		f.setLayout(null);
		f.setSize(500,500);
		f.setVisible(true);
	}
	public static void main(String args[])
	{
		Test_Awt ob = new Test_Awt();
	}
}