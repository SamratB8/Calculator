package Calculator;

import java.util.Scanner;

public class Multiply
{
    static Scanner sc = new Scanner(System.in);

    public static String main()
    {
        return (StandardCalculator.type);
    }

    public static double Multiply()
    {
        System.out.println("Enter the numbers you want to multiply (Seperate them with '*' and don't put spaces):");
        String nummul = sc.next();

        String[] arr = nummul.replace("*", " ").split(" ");

        double mul = 1;
        for (int i = 0; i < arr.length; i++)
        {
            switch (main())
            {
                case "Binary":
                    fromBinary.Convert(arr[i]);
                    mul *= fromBinary.dnum;
                    break;
                case "Decimal":
                    mul *= Double.parseDouble(arr[i]);
                    break;
                case "Octal":
                    fromOctal.Convert(arr[i]);
                    mul *= fromOctal.dnum;
                    break;
                case "Hexadecimal":
                    fromHexaDecimal.Convert(arr[i]);
                    mul *= fromHexaDecimal.dnum;
                    break;
                default:
                    System.out.println("Incorrect Choice. Enter the program number.");
                    System.exit(0);
            }
        }

        return mul;
    }
}
