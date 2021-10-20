/************************************
 * Md. Jafrul Haque Rafi            *
 * ID: 2012020259                   *
 * Sec: F                           *
 * email: cse_2012020259@lus.ac.bd  *
 * Date: 16/10/21                   *
 ************************************/


package Rafi;

import java.math.BigInteger;

public class MyCalculator implements AdvancedArithmetic
{
    @Override

    public void divisorSum(int n) {
        int res = 0;

        for(int i = 1; i<=n; i++)
        {

            if(n%i == 0)
            {
                res += i;
            }

        }
        System.out.println("The Divisor of Sum for " + n + " is " + res);
    }

    @Override
    public void findFactorial(int n)
    {
        BigInteger result = BigInteger.ONE;

        for(int i = 1; i<=n; i++)
        {
            result = result.multiply(BigInteger.valueOf(i));
        }
        System.out.println(n + "! = " + result);
    }
}