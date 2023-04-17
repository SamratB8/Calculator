package CalculatorEssentials;

public class fromHexaDecimal
{
    public static int dnum;
    public static String binary, octal;

    public static void Convert(String num)
    {
        int l = num.length();

        dnum = 0;

        int base = 1;
        for (int i = l - 1; i >= 0; i--)
        {
            if (num.charAt(i) >= '0' && num.charAt(i) <= '9')
            {
                dnum += (num.charAt(i) - 48) * base;
                base *= 16;
            }
            else if (num.charAt(i) >= 'A' && num.charAt(i) <= 'F')
            {
                dnum += (num.charAt(i) - 55) * base;
                base *= 16;
            }
            else if (num.charAt(i) >= 'a' && num.charAt(i) <= 'f')
            {
                dnum += (num.charAt(i) - 87) * base;
                base *= 16;
            }
        }

        binary = Integer.toBinaryString(dnum);

        octal = Integer.toOctalString(dnum);
    }

    public static void Print()
    {
        System.out.println("Binary: " + binary);
        System.out.println("Decimal: " + dnum);
        System.out.println("Octal: " + octal);
    }
}
