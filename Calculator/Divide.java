package Calculator;

import java.util.Scanner;

public class Divide
{
    static Scanner sc = new Scanner(System.in);

    public static String main()
    {
        return (StandardCalculator.type);
    }

    public static double Divide()
    {
        System.out.println("Enter the numbers you want to divide (Seperate them with '/' and don't put spaces):");
        String numdiv = sc.next();

        String[] arr = numdiv.replace("/", " ").split(" ");

        double div = Double.parseDouble(arr[0]);
        for (int i = 0; i < arr.length; i++)
        {
            switch (main())
            {
                case "Binary":
                    fromBinary.Convert(arr[i]);
                    div /= fromBinary.dnum;
                    break;
                case "Decimal":
                    div /= Double.parseDouble(arr[i]);
                    break;
                case "Octal":
                    fromOctal.Convert(arr[i]);
                    div /= fromOctal.dnum;
                    break;
                case "Hexadecimal":
                    fromHexaDecimal.Convert(arr[i]);
                    div /= fromHexaDecimal.dnum;
                    break;
                default:
                    System.out.println("Incorrect Choice. Enter the program number.");
                    System.exit(0);
            }
        }

        return div;
    }
}
