package CalculatorEssentials;

import java.util.Scanner;

public class Logarithm
{
    public static double Logarithm()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number you want to log: ");
        double num  = sc.nextDouble();
        System.out.print("Enter the base of the logarithm: ");
        double base = sc.nextDouble();
        return Math.log(num) / Math.log(base);
    }
}
