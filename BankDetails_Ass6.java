/*
*ASS - 6
*BANK DETAILS USING INHERITANCE
*/


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Bank
{
    String name;
    String ID;
    static String acType;

    Bank(String name, String ID)
    {
        this.name = name;
        this.ID = ID;
    }

    static
    {
        acType = "Savings a/c";
    }

    double rateOfInterest()
    {
        return 0;
    }

    void display()
    {
        System.out.println("Rate of interest = " + rateOfInterest());
        System.out.println("A/C type  = " + acType);
        System.out.println("A/C number = " + ID);
        System.out.println("A/C holder = " + name);
    }
}

class SBI extends Bank
{
    SBI(String name, String ID)
    {
        super(name, ID);
    }

    double rateOfInterest()
    {
        return (7.5);
    }
}
class ICICI extends Bank
{
    ICICI(String name, String ID)
    {
        super(name, ID);
    }

    double rateOfInterest()
    {
        return (9);
    }
}

class BankDetails_Ass6
{
    public static void main(String args[])throws IOException
    {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        String id , name;

        System.out.println("====    SBI   ====");

        System.out.print("Enter A/C number =  ");
        id = buf.readLine();

        System.out.print("Enter A/C holder name =  ");
        name = buf.readLine();

        SBI ob1 = new SBI(name, id);
        ob1.display();

        System.out.println("====   ICICI  ====");

        System.out.print("Enter A/C number =  ");
        id = buf.readLine();

        System.out.print("Enter A/C holder name =  ");
        name = buf.readLine();

        ICICI ob2 = new ICICI(name, id);
        ob2.display();
    }
}