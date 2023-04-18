package CalculatorEssentials;

import java.util.Scanner;

public class Sinh
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the angle in degrees: ");
        double angle = sc.nextDouble();
        double angleInRadians = Math.toRadians(angle);
        double sinh = Math.sinh(angleInRadians);
        System.out.println("The hyperbolic sine of " + angle + " is " + sinh);
    }
}
