package Calculator;

import java.util.Scanner;

public class SquareRoot
{
    public static double SquareRoot()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number you want to square root:");
        return Math.sqrt(sc.nextInt());
    }
}
