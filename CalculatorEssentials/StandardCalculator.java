package CalculatorEssentials;

import java.util.Scanner;

public class StandardCalculator
{
    public static String type;

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Type of numbers you can enter:\n1.Binary\n2.Decimal\n3.Octal\n4.Hexadecimal\n\nEnter the type of number you want to enter: ");
        type = sc.next();

        System.out.print("What do you want to do?\n1.Add\n2.Subtract\n3.Multiply\n4.Divide\n\nEnter the number of the operation you want to do: ");
        String operation = sc.next();

        double result = 0;
        switch (operation)
        {
            case "1":
                result = Add.Add();
                break;
            case "2":
                result = Subtract.Subtract();
                break;
            case "3":
                result = Multiply.Multiply();
                break;
            case "4":
                result = Divide.Divide();
                break;
            default:
                System.out.println("Incorrect Choice. Enter the operation number.");
                System.exit(0);
        }

        System.out.println("Result: " + result);
    }

}
