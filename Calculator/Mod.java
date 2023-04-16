package Calculator;

import java.util.Scanner;

public class Mod
{
    public static double Mod()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number you want to mod:");
        int num = sc.nextInt();
        System.out.println("Enter the mod:");
        int mod = sc.nextInt();
        return num % mod;
    }
}
