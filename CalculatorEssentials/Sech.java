package CalculatorEssentials;

import java.util.Scanner;

public class Sech
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the angle in degrees: ");
        double angle = sc.nextDouble();
        double angleInRadians = Math.toRadians(angle);
        double sech = 1 / Math.cosh(angleInRadians);
        System.out.println("The hyperbolic secant of " + angle + " is " + sech);
    }
}
