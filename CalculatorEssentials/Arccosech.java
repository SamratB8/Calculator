package CalculatorEssentials;

import java.util.Scanner;

public class Arccosech
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the angle in degrees: ");
        double angle = sc.nextDouble();
        double angleInRadians = Math.toRadians(angle);
        double acosech = Math.log((1/Math.sinh(angleInRadians)) + Math.sqrt((1/Math.sinh(angleInRadians))*(1/Math.sinh(angleInRadians)) + 1));
        System.out.println("The arc hyperbolic cosecant of " + angle + " is " + acosech);
    }
}
