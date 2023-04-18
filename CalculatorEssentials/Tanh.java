package CalculatorEssentials;

import java.util.Scanner;

public class Tanh
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the angle in degrees: ");
        double angle = sc.nextDouble();
        double angleInRadians = Math.toRadians(angle);
        double tanh = Math.tanh(angleInRadians);
        System.out.println("The hyperbolic tangent of " + angle + " is " + tanh);
    }
}
