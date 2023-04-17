import CalculatorEssentials.*;
import java.util.Scanner;

public class Calculator
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("""
                Welcome to the Calculator Program!
                
                This program has 3 calculators:
                1.Standard Calculator
                2.Programming Calculator
                3.Scientific Calculator
                
                
                Please note that many features have been removed to make it lightweight and easy to use. For complete functionality please use the calculator available on the latest version of Microsoft Windows(TM).
                """);

        System.out.println("What do you want to run?\n1.Standard Calculator\n2.Programming Calculator\n\nEnter the number of the calculator you want to run: ");
        String calculator = sc.next();

        switch (calculator)
        {
            case "1":
                StandardCalculator.main(args);
                break;
            case "2":
                ProgrammingCalculator.main(args);
                break;
            case "3":
                ScientificCalculator.main(args);
                break;
            default:
                System.out.println("Incorrect Choice. Enter the calculator number.");
        }
    }
}
