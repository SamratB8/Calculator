package CalculatorEssentials;

import java.util.Scanner;

public class Add
{
    static Scanner sc = new Scanner(System.in);

    public static String main()
    {
        return (StandardCalculator.type);
    }

    public static double Add()
    {
        System.out.println("Enter the numbers you want to add (Seperate them with '+' and don't put spaces):");
        String numadd = sc.next();

        String[] arr = numadd.replace("+", " ").split(" ");

        double sum = 0;
        for (int i = 0; i < arr.length; i++)
        {
            switch (main())
            {
                case "Binary":
                    fromBinary.Convert(arr[i]);
                    sum += fromBinary.dnum;
                    break;
                case "Decimal":
                    sum += Double.parseDouble(arr[i]);
                    break;
                case "Octal":
                    fromOctal.Convert(arr[i]);
                    sum += fromOctal.dnum;
                    break;
                case "Hexadecimal":
                    fromHexaDecimal.Convert(arr[i]);
                    sum += fromHexaDecimal.dnum;
                    break;
                default:
                    System.out.println("Incorrect Choice. Enter the program number.");
                    System.exit(0);
            }
        }

        return sum;
    }
}
