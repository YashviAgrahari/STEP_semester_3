package ques5;

class FeeAccount
{
    void pay(double amount)
    {
        System.out.println("Paid in one go (day-scholar account)");
    }
}

class HostelFeeAccount extends FeeAccount
{
    void pay(double amount)
    {
        System.out.println("Paid in two installments (hostel account)");
    }
}

public class Main
{
    void processPayment(FeeAccount account, double amount)
    {
        if(account instanceof HostelFeeAccount)
        {
            account.pay(amount);
            hostelCount++;
        }
        else
        {
            account.pay(amount);
            dayScholarCount++;
        }
    }

    int hostelCount = 0;
    int dayScholarCount = 0;

    public static void main(String[] args)
    {
        Main m = new Main();

        FeeAccount[] accounts =
        {
            new HostelFeeAccount(),
            new HostelFeeAccount(),
            new FeeAccount(),
            new FeeAccount()
        };

        for(int i = 0; i < accounts.length; i++)
        {
            m.processPayment(accounts[i], 60000);
        }

        System.out.println("Hostel accounts processed: " + m.hostelCount +
                " | Day-scholar accounts processed: " + m.dayScholarCount);
    }
}
