package CalculatorEssentials;

import java.util.Scanner;

public class Arcsech
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the angle in degrees: ");
        double angle = sc.nextDouble();
        double angleInRadians = Math.toRadians(angle);
        double asech = Math.log((1 + Math.sqrt(1 - Math.pow(angleInRadians, 2))) / angleInRadians);
        System.out.println("The arc hyperbolic secant of " + angle + " is " + asech);
    }
}
