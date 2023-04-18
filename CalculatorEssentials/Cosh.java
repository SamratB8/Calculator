package CalculatorEssentials;

import java.util.Scanner;

public class Cosh
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the angle in degrees: ");
        double angle = sc.nextDouble();
        double angleInRadians = Math.toRadians(angle);
        double cosh = Math.cosh(angleInRadians);
        System.out.println("The hyperbolic cosine of " + angle + " is " + cosh);
    }
}
