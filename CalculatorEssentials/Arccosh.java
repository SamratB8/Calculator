package CalculatorEssentials;

import java.util.Scanner;

public class Arccosh
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the angle in degrees: ");
        double angle = sc.nextDouble();
        double angleInRadians = Math.toRadians(angle);
        double acosh = Math.log(angleInRadians + Math.sqrt(angleInRadians * angleInRadians - 1));
        System.out.println("The arc hyperbolic cosine of " + angle + " is " + acosh);
    }
}
