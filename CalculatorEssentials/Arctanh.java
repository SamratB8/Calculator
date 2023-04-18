package CalculatorEssentials;

import java.util.Scanner;

public class Arctanh
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the angle in degrees: ");
        double angle = sc.nextDouble();
        double angleInRadians = Math.toRadians(angle);
        double atanh = 0.5 * Math.log((1 + angleInRadians) / (1 - angleInRadians));
        System.out.println("The arc hyperbolic tangent of " + angle + " is " + atanh);
    }
}
