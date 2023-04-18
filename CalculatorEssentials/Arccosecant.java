package CalculatorEssentials;

import java.util.Scanner;

public class Arccosecant
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the angle in degrees: ");
        double angle = sc.nextDouble();
        double angleInRadians = Math.toRadians(angle);
        double acosec = 1 / Math.sin(angleInRadians);
        System.out.println("The arccosecant of " + angle + " is " + acosec);
    }
}
