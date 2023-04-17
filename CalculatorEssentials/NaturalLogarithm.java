package CalculatorEssentials;

import java.util.Scanner;

public class NaturalLogarithm
{
    public static double NaturalLogarithm()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number you want to log: ");
        double num  = sc.nextDouble();
        return Math.log(num);
    }
}
