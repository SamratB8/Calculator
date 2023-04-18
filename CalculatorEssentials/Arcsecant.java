package CalculatorEssentials;

import java.util.Scanner;

public class Arcsecant
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the angle in degrees: ");
        double angle = sc.nextDouble();
        double angleInRadians = Math.toRadians(angle);
        double asec = 1 / Math.acos(angleInRadians);
        System.out.println("The arcsecant of " + angle + " is " + asec);
    }
}
