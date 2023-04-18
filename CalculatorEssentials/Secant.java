package CalculatorEssentials;

import java.util.Scanner;

public class Secant
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the angle in degrees: ");
        double angle = sc.nextDouble();
        double angleInRadians = Math.toRadians(angle);
        double sec = 1/Math.cos(angleInRadians);
        System.out.println("Secant of " + angle + " is " + sec);
    }
}
