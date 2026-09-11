package ques5HW;

public class NightlySettlement
{
    static String processNightlySettlement(BookingReceipt[] receipts)
    {
        int processed = 0;
        int nullSkipped = 0;
        int group = 0;
        int individual = 0;

        for (int i = 0; i < receipts.length; i++)
        {
            if (receipts[i] == null)
            {
                nullSkipped++;
            }
            else
            {
                processed++;

                if (receipts[i] instanceof GroupBookingReceipt)
                {
                    group++;
                }
                else
                {
                    individual++;
                }
            }
        }

        return processed + " processed | " +
               nullSkipped + " null skipped | " +
               group + " group | " +
               individual + " individual";
    }
}
