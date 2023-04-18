package CalculatorEssentials;

import java.util.Scanner;

public class Arccoth
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the angle in degrees: ");
        double angle = sc.nextDouble();
        double angleInRadians = Math.toRadians(angle);
        double acoth = Math.log((angleInRadians + Math.sqrt(angleInRadians * angleInRadians - 1)) / (angleInRadians - Math.sqrt(angleInRadians * angleInRadians - 1))) / 2;
        System.out.println("The arc hyperbolic cotangent of " + angle + " is " + acoth);
    }
}
