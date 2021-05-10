/*
* ASS - 7
* ABSTRACT CLASS BANK RATE OF INTEREST
*  DATED - 5.10.2020
*/
abstract class Bank {
    abstract float getRateOfInterest();
    abstract float getBalance();
}

class SBI extends Bank {
    float getRateOfInterest() {
        return 3.4f;
    }

    float getBalance() {
        return 1000f;
    }
}

class PNB extends Bank {
    float getRateOfInterest() {
        return 4.2f;
    }

    float getBalance() {
        return 1100f;
    }
}

class BOI extends Bank {
    float getRateOfInterest() {
        return 4.4f;
    }

    float getBalance() {
        return 1200f;
    }
}

class IOB extends Bank {
    float getRateOfInterest() {
        return 5f;
    }

    float getBalance() {
        return 1300f;
    }
}

class UCO extends Bank {
    float getRateOfInterest() {
        return 5.2f;
    }

    float getBalance() {
        return 1400f;
    }
}

public class BankDetails_Ass7 {
    public static void main(String[] args) {
        Bank b = new SBI();
        System.out.println("\n====================SBI BANK DETAILS=======================");
        System.out.println("ROI: " + b.getRateOfInterest());
        System.out.println("Balance: " + b.getBalance());

        b = new PNB();
        System.out.println("\n=================PNB BANK DETAILS=========================");
        System.out.println("ROI: " + b.getRateOfInterest());
        System.out.println("Balance: " + b.getBalance());

        b = new BOI();
        System.out.println("\n=================BOI BANK DETAILS=========================");
        System.out.println("ROI: " + b.getRateOfInterest());
        System.out.println("Balance: " + b.getBalance());

        b = new IOB();
        System.out.println("\n==================IOB BANK DETAILS========================");
        System.out.println("ROI: " + b.getRateOfInterest());
        System.out.println("Balance: " + b.getBalance());

        b = new UCO();
        System.out.println("\n==================UCO BANK DETAILS=========================");
        System.out.println("ROI: " + b.getRateOfInterest());
        System.out.println("Balance: " + b.getBalance());
    }
}
