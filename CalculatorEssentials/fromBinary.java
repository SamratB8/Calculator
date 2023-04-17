package CalculatorEssentials;

public class fromBinary
{
    public static int dnum;
    public static String octal, hex;

    static void Convert(String num)
    {
        int l = num.length();
        String[] arr = num.split("");

        int[] numArr = new int[l];
        for (int i = 0; i < l; i++)
        {
            numArr[i] = Integer.parseInt(arr[i]);
        }
        dnum = 0;

        int base = 1;
        for (int i = l - 1; i >= 0; i--)
        {
            dnum += numArr[i] * base;
            base *= 2;
        }

        octal = Integer.toOctalString(dnum);

        hex = Integer.toHexString(dnum);
    }

    static void Print()
    {
        System.out.println("Decimal: " + dnum);
        System.out.println("Octal: " + octal);
        System.out.println("Hexadecimal: " + hex);
    }
}
