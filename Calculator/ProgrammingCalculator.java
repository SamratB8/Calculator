package Calculator;

import java.util.Scanner;

public class ProgrammingCalculator
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Type of numbers you can enter:\n1.Binary\n2.Decimal\n3.Octal\n4.Hexadecimal\n\nEnter the type of number you want to enter: ");
        String type = sc.next();

        System.out.print("Enter your number: ");
        String num = sc.next();

        switch (type)
        {
            case "Binary":
                fromBinary.Convert(num);
                fromBinary.Print();
                break;
            case "Decimal":
                fromDecimal.Convert(num);
                fromDecimal.Print();
                break;
            case "Octal":
                fromOctal.Convert(num);
                fromOctal.Print();
                break;
            case "Hexadecimal":
                fromHexaDecimal.Convert(num);
                fromHexaDecimal.Print();
                break;
            default: System.out.println("Incorrect Choice. Enter the program number.");
        }
        sc.close();
    }
}
