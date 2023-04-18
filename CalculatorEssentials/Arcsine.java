package CalculatorEssentials;

import java.util.Scanner;

public class Arcsine
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the angle in degrees: ");
        double angle = sc.nextDouble();
        double angleInRadians = Math.toRadians(angle);
        double asin = Math.asin(angleInRadians);
        System.out.println("The arcsine of " + angle + " is " + asin);
    }
}
