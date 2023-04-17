package CalculatorEssentials;

import java.util.Scanner;

public class ScientificCalculator
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Type of numbers you can enter:\n1.Binary\n2.Decimal\n3.Octal\n4.Hexadecimal\n\nEnter the type of number you want to enter: ");
        StandardCalculator.type = sc.next();

        System.out.print("What do you want to do?\n1.Add\n2.Subtract\n3.Multiply\n4.Divide\n5.Square\n6.Square Root\n7.Factorial\n8.Power\n9.Mod\n10.Pie\n11.Logarithm\n12.Natural Logarithm\n\nEnter the number of the operation you want to do: ");
        String operation = sc.next();

        double result = 0;
        switch (operation) {
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
            case "5":
                result = Square.Square();
                break;
            case "6":
                result = SquareRoot.SquareRoot();
                break;
            case "7":
                result = Factorial.Factorial();
                break;
            case "8":
                result = Power.Power();
                break;
            case "9":
                result = Mod.Mod();
                break;
            case "10":
                result = Pie.Pie();
                break;
            case "11":
                result = Logarithm.Logarithm();
                break;
            case "12":
                result = NaturalLogarithm.NaturalLogarithm();
                break;
            default:
                System.out.println("Invalid operation");
        }

        System.out.println("Result: " + result);
    }
}
