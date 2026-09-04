package ques3HW;

public class Main
{
    static void findLongestStreak(String signalLog)
    {
        int count = 1;
        int longest = 1;
        char longestColor = signalLog.charAt(0);

        for(int i = 1; i < signalLog.length(); i++)
        {
            if(signalLog.charAt(i) == signalLog.charAt(i - 1))
            {
                count++;
            }
            else
            {
                count = 1;
            }

            if(count > longest)
            {
                longest = count;
                longestColor = signalLog.charAt(i);
            }
        }

        System.out.println("Longest Streak: '" + longestColor + "' repeated " + longest + " times");
    }

    public static void main(String[] args)
    {
        String signalLog = "RRGGGYRR";

        findLongestStreak(signalLog);
    }
}
