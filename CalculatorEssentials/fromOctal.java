package CalculatorEssentials;

public class fromOctal
{
    public static int dnum;
    public static String binary, hex;

    public static void Convert(String num)
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
            base *= 8;
        }

        binary = Integer.toBinaryString(dnum);

        hex = Integer.toHexString(dnum);
    }

    public static void Print()
    {
        System.out.println("Binary: " + binary);
        System.out.println("Decimal: " + dnum);
        System.out.println("Hexadecimal: " + hex);
    }
}
