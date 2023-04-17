package CalculatorEssentials;

import java.util.Scanner;

public class Subtract
{
    static Scanner sc = new Scanner(System.in);

    public static String main()
    {
        return (StandardCalculator.type);
    }

    public static double Subtract()
    {
        System.out.println("Enter the numbers you want to subtract (Separate them with '-' and don't put spaces):");
        String numsub = sc.next();

        String[] arr = numsub.replace("-", " ").split(" ");

        double sub = Double.parseDouble(arr[0]);
        for (int i = 0; i < arr.length; i++)
        {
            switch (main())
            {
                case "Binary":
                    fromBinary.Convert(arr[i]);
                    sub -= fromBinary.dnum;
                    break;
                case "Decimal":
                    sub -= Double.parseDouble(arr[i]);
                    break;
                case "Octal":
                    fromOctal.Convert(arr[i]);
                    sub -= fromOctal.dnum;
                    break;
                case "Hexadecimal":
                    fromHexaDecimal.Convert(arr[i]);
                    sub -= fromHexaDecimal.dnum;
                    break;
                default:
                    System.out.println("Incorrect Choice. Enter the program number.");
                    System.exit(0);
            }
        }

        return sub;
    }
}
