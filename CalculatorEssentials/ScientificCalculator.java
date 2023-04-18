package CalculatorEssentials;

import java.util.Scanner;

public class ScientificCalculator
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Type of numbers you can enter:\n1.Binary\n2.Decimal\n3.Octal\n4.Hexadecimal\n\nEnter the type of number you want to enter: ");
        StandardCalculator.type = sc.next();

        System.out.print("""
                What do you want to do?
                1.Add
                2.Subtract
                3.Multiply
                4.Divide
                5.Square
                6.Square Root
                7.Factorial
                8.Power
                9.Mod
                10.Pie
                11.Logarithm
                12.Natural Logarithm
                13.Sine
                14.Cosine
                15.Tangent
                16.Cosecant
                17.Secant
                18.Cotangent
                19.Arc Sine
                20.Arc Cosine
                21.Arc Tangent
                22.Arc Cosecant
                23.Arc Secant
                24.Arc Cotangent
                37.Hyperbolic Sine
                38.Hyperbolic Cosine
                39.Hyperbolic Tangent
                40.Hyperbolic Cosecant
                41.Hyperbolic Secant
                42.Hyperbolic Cotangent
                43.Arc Hyperbolic Sine
                44.Arc Hyperbolic Cosine
                45.Arc Hyperbolic Tangent
                46.Arc Hyperbolic Cosecant
                47.Arc Hyperbolic Secant
                48.Arc Hyperbolic Cotangent
                
                Enter the number of the operation you want to do: """);
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
            case "13":
                Sine.main(args);
                break;
            case "14":
                Cosine.main(args);
                break;
            case "15":
                Tangent.main(args);
                break;
            case "16":
                Cosecant.main(args);
                break;
            case "17":
                Secant.main(args);
                break;
            case "18":
                Cotangent.main(args);
                break;
            case "19":
                Arcsine.main(args);
                break;
            case "20":
                Arccosine.main(args);
                break;
            case "21":
                Arctangent.main(args);
                break;
            case "22":
                Arccosecant.main(args);
                break;
            case "23":
                Arcsecant.main(args);
                break;
            case "24":
                Arccotangent.main(args);
                break;
            case "37":
                Sinh.main(args);
                break;
            case "38":
                Cosh.main(args);
                break;
            case "39":
                Tanh.main(args);
                break;
            case "40":
                Cosech.main(args);
                break;
            case "41":
                Sech.main(args);
                break;
            case "42":
                Coth.main(args);
                break;
            case "43":
                Arcsinh.main(args);
                break;
            case "44":
                Arccosh.main(args);
                break;
            case "45":
                Arctanh.main(args);
                break;
            case "46":
                Arccosech.main(args);
                break;
            case "47":
                Arcsech.main(args);
                break;
            case "48":
                Arccoth.main(args);
                break;
            default:
                System.out.println("Invalid operation");
        }

        if (operation < 13)
        {
            System.out.println("Result: " + result);
        }
    }
}
