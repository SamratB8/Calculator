package CalculatorEssentials;

import java.util.Scanner;

public class Sine
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the angle in degrees: ");
        double angle = sc.nextDouble();
        double angleInRadians = Math.toRadians(angle);
        double sin = Math.sin(angleInRadians);
        System.out.println("The sine of " + angle + " is " + sin);
    }
}
