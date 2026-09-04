package ques5;

public class Main
{
    static String reverseCustomerName(String customerName)
    {
        String reverse = "";

        for(int i = customerName.length() - 1; i >= 0; i--)
        {
            reverse = reverse + customerName.charAt(i);
        }

        return reverse;
    }

    public static void main(String[] args)
    {
        String customerName = "Sunil";

        String reversedName = reverseCustomerName(customerName);

        System.out.println("Original Name: " + customerName);
        System.out.println("Reversed Name: " + reversedName);
    }
}
