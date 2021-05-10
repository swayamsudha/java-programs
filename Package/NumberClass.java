// class file "NumberClass" 

package com.myjava.pac;

public class NumberClass 
{
    int x;
    boolean primeFlag;

    public NumberClass(int x)
    {
        this.x = x;
    }

    public boolean isZero()
    {
        if (x == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean isPositive()
    {
        if (x > 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean isNegative()
    {
        if (x < 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean isEven()
    {
        if (x % 2 == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public boolean isOdd()
    {
        if (x % 2 != 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean isPrime()
    {
        if (x <= 1)
        {   
            primeFlag = false;
            return false;
        }

        for (int i = 2; i < x; ++i)
        {
            if (x % i == 0)
            {   
                primeFlag = false;
                return false;
            }
        }

        primeFlag = true;
        return true;
    }

    public boolean isAmstrong()
    {
        int rem, sum = 0, temp = x;

        while(temp != 0)
        {
            rem = temp % 10;
            sum += Math.pow(rem, 3);    // rem * rem * rem
            temp /= 10;
        }

        if(sum == x)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public double getSqure()
    {
        return (x * x);
    }

    public double getCube()
    {
        return (x * x * x);
    }

    public double getSqrt()
    {
        return (Math.sqrt(x));
    }

    public void printFactor()
    {          
        for (int i = 1; i <= x; ++i)
        {
            if (x % i == 0)
            {
                System.out.print(i + "  ");
            }
        }
    }

    public void printPrimeFactor()
    {
        if (primeFlag)
        {
            System.out.println("Prime number dont have prime factors.");
        }
        else
        {
            for (int i = 2; i < x; ++i)
            {
                boolean isPrime = true;

                if (x % i == 0)
                {
                    for (int j = 2; j <= i / 2; j++)
                    {
                        if (i % j == 0)
                        {
                            isPrime = false;
                            break;
                        }
                    }
    
                    if (isPrime == true)
                    {
                        System.out.print(i + "  ");
                    }
                }
            }
        }
    }
}
