package CalculatorEssentials;

import java.util.Scanner;

public class Power
{
    public static double Power()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number you want to power:");
        int num = sc.nextInt();
        System.out.println("Enter the power:");
        int pow = sc.nextInt();
        return Math.pow(num, pow);
    }
}
