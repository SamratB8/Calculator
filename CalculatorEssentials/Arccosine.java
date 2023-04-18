package CalculatorEssentials;

import java.util.Scanner;

public class Arccosine
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the angle in degrees: ");
        double angle = sc.nextDouble();
        double angleInRadians = Math.toRadians(angle);
        double acos = Math.acos(angleInRadians);
        System.out.println("The arccosine of " + angle + " is " + acos);
    }
}
