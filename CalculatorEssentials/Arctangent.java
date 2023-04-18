package CalculatorEssentials;

import java.util.Scanner;

public class Arctangent
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the angle in degrees: ");
        double angle = sc.nextDouble();
        double angleInRadians = Math.toRadians(angle);
        double atan = Math.atan(angleInRadians);
        System.out.println("The arctangent of " + angle + " is " + atan);
    }
}
