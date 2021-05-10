/*  
    programe name   :   To impliment a programe having Class "NumberClass" in package
                         "com.myjava.pac" having varriable x
                        constructor(s) and methods isZero(), isPossitive(), isEven(),
                        isOdd(), isPrime(), isArmstrong() returning boolean type and 
                        getSqure(), getSqrt(), getCube() returning double type and 
                        printFactor(), printPrimeFactor() returning nothing. 
    file name       :   Main.java
    date            :
*/

import com.myjava.pac.*;
import java.util.Scanner;

class Package_Main 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number = ");
        int num = sc.nextInt();

        NumberClass obj = new NumberClass(num);

        System.out.println(num + " is Zero = " + obj.isZero());
        System.out.println(num + " is positive = " + obj.isPositive());
        System.out.println(num + " is negative = " + obj.isNegative());
        System.out.println(num + " is odd  = " + obj.isOdd());
        System.out.println(num + " is even  = " + obj.isEven());
        System.out.println(num + " is prime number = " + obj.isPrime());
        System.out.println(num + " is amstrong number = " + obj.isAmstrong());
        System.out.println("square of " + num + " = " + obj.getSqure());
        System.out.println("cube of " + num + " = " + obj.getCube());
        System.out.printf("square root of %d = %.3f", num, obj.getSqrt());

        if ( num < 1)
        {
            System.out.println("\n can not find Factors of negative number or 0 ");
        }
        else
        {
            System.out.println("\nFactors of " + num);
            obj.printFactor();
        }

        if (num <= 1)
        {
            System.out.println("\n can not find prime Factors of negative number or 0 or 1");

        }
        else
        {
            System.out.println("\nPrime Factors of " + num);
            obj.printPrimeFactor();    
        }
        
        sc.close();
    }
}
