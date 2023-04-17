package CalculatorEssentials;

public class fromDecimal
{
    public static String binary, octal, hex;

    public static void Convert(String num)
    {
        int bnum, onum;

        binary = Integer.toBinaryString(Integer.parseInt(num));

        octal = Integer.toOctalString(Integer.parseInt(num));

        hex = Integer.toHexString(Integer.parseInt(num));
    }

    public static void Print()
    {
        System.out.println("Binary: " + binary);
        System.out.println("Octal: " + octal);
        System.out.println("Hexadecimal: " + hex);
    }
}
