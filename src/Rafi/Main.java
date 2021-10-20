/************************************
 * Md. Jafrul Haque Rafi            *
 * ID: 2012020259                   *
 * Sec: F                           *
 * email: cse_2012020259@lus.ac.bd  *
 * Date: 16/10/21                   *
 ************************************/

package Rafi;

import java.util.Scanner;
public class Main
{

    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);

        AdvancedArithmetic math = new MyCalculator();

        System.out.print("Enter a number to find divisor of sum: ");
        int a = input.nextInt();

        math.divisorSum(a);

        System.out.print("Enter a number to find factorial: ");
        int b = input.nextInt();

        math.findFactorial(b);

    }
}