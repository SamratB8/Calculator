package CalculatorEssentials;

import java.util.Scanner;

public class Cotangent
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the angle in degrees: ");
        double angle = sc.nextDouble();
        double angleInRadians = Math.toRadians(angle);
        double result = 1/Math.tan(angleInRadians);
        System.out.println("The cotangent of " + angle + " is " + result);
    }
}
