package ques4;

public class Main
{
    static String maskPhoneNumber(String phone)
    {
        if(phone.length() != 10)
        {
            return "Invalid phone number";
        }

        for(int i = 0; i < phone.length(); i++)
        {
            if(phone.charAt(i) < '0' || phone.charAt(i) > '9')
            {
                return "Invalid phone number";
            }
        }

        StringBuilder result = new StringBuilder("XXXXXX");

        result.append("-");
        result.append(phone.substring(6));

        return result.toString();
    }

    public static void main(String[] args)
    {
        String phone = "9876543210";

        System.out.println(maskPhoneNumber(phone));
    }
}
