package CalculatorEssentials;

import java.util.Scanner;

public class Cosine
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the angle in degrees: ");
        double angle = sc.nextDouble();
        double angleInRadians = Math.toRadians(angle);
        double cos = Math.cos(angleInRadians);
        System.out.println("The cosine of " + angle + " is " + cos);
    }
}
