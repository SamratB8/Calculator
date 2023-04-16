package Calculator;

import java.util.Scanner;

public class Square
{
    public static int Square()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number you want to square:");
        return (int) Math.pow(sc.nextInt(), 2);
    }
}
