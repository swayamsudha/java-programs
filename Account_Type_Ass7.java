import java.util.Scanner;

abstract class Account 
{
	String acc_type;
    String acc_holder_name;
    String mobile_no;
    float  balance;
    float  min_balance;
    

    abstract void getBalance();
    abstract void getMobileNo();
    abstract void getAccHolderName();
    abstract void details();
}

class SavingAcc extends Account
 {
    SavingAcc() 
	{
        acc_type = "SAVINGS ACCOUNT";
        min_balance = (float)1000;
    }

    void getBalance() 
	{
        Scanner sc = new Scanner(System.in);

        System.out.print("Current Balance:");
        balance = sc.nextFloat();
    }

    void getMobileNo() 
	{
        Scanner sc = new Scanner(System.in);

        System.out.print("Mobile Number:");
        mobile_no = sc.nextLine();
    }

    void getAccHolderName() 
	{
        Scanner sc = new Scanner(System.in);

        System.out.print("Name:");
        acc_holder_name = sc.nextLine();
    }

    void details() 
	{
        System.out.println("acct. Type = " + acc_type);
        System.out.println("acct. Name = " + acc_holder_name);
        System.out.println("Current Balance = " + balance);
        System.out.println("Mobile Number = " + mobile_no);
    }
}

class CurrentAcc extends Account 
{
    CurrentAcc()
	{
        acc_type = "CURRENT ACCOUNT";
        min_balance = (float)1000;
    }
    
    void getBalance() 
	{
        Scanner sc = new Scanner(System.in);

        System.out.print("Current Balance:");
        balance = sc.nextFloat();
    }

    void getMobileNo() 
	{
        Scanner sc = new Scanner(System.in);

        System.out.print("Mobile Number:");
        mobile_no = sc.nextLine();
    }

    void getAccHolderName() 
	{
        Scanner sc = new Scanner(System.in);

        System.out.print("Name:");
        acc_holder_name = sc.nextLine();
    }

    void details()
	{
        System.out.println("acct. Type = " + acc_type);
        System.out.println("acct. Name = " + acc_holder_name);
        System.out.println("Current Balance = " + balance);
        System.out.println("Mobile Number = " + mobile_no);
    }
}

public class Account_Type_Ass7
{
    public static void main(String[] args) 
	{
        System.out.println("\n=========SAVINNGS ACCOUNT=========");
        
        Account ac = new SavingAcc();
        ac.getAccHolderName();
        ac.getBalance();
        ac.getMobileNo();

        System.out.println("\n========= SAVINNGS ACCOUNT DETAILS =========");
        ac.details();

        System.out.println("\n===========CURRENT ACCOUNT==========");

        ac = new CurrentAcc();
        ac.getAccHolderName();
        ac.getBalance();
        ac.getMobileNo();

        System.out.println("\n============ CURRENT ACCOUNT DETAILS ================");
        ac.details();
    }
}
