package CalculatorEssentials;

import java.util.Scanner;

public class Tangent
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the angle in degrees: ");
        double angle = sc.nextDouble();
        double angleInRadians = Math.toRadians(angle);
        double tan = Math.tan(angleInRadians);
        System.out.println("Tangent of " + angle + " is " + tan);
    }
}
