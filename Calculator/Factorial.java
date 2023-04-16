package Calculator;

import java.util.Scanner;

public class Factorial
{
    public static int Factorial()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number you want to factorial:");
        int num = sc.nextInt();
        int fact = 1;
        for (int i = 1; i <= num; i++)
        {
            fact *= i;
        }
        return fact;
    }
}
