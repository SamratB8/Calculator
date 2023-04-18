package CalculatorEssentials;

import java.util.Scanner;

public class Coth
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the angle in degrees: ");
        double angle = sc.nextDouble();
        double angleInRadians = Math.toRadians(angle);
        double coth = 1/Math.tanh(angleInRadians);
        System.out.println("The hyperbolic cotangent of " + angle + " is " + coth);
    }
}
