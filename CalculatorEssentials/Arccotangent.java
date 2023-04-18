package CalculatorEssentials;

import java.util.Scanner;

public class Arccotangent
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the angle in degrees: ");
        double angle = sc.nextDouble();
        double angleInRadians = Math.toRadians(angle);
        double acot = 1 / Math.atan(angleInRadians);
        System.out.println("The arccotangent of " + angle + " is " + acot);
    }
}
