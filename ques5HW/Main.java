package ques5HW;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collections;

public class Main
{
    static void printFilteredWordFrequency(String feedback)
    {
        feedback = feedback.toLowerCase();
        feedback = feedback.replace(".", "");
        feedback = feedback.replace(",", "");

        String[] words = feedback.split("\\s+");

        String[] stopWords = {"the", "was", "and", "a", "is", "of", "in"};

        HashMap<String, Integer> count = new HashMap<String, Integer>();

        for(int i = 0; i < words.length; i++)
        {
            boolean stopWord = false;

            for(int j = 0; j < stopWords.length; j++)
            {
                if(words[i].equals(stopWords[j]))
                {
                    stopWord = true;
                }
            }

            if(stopWord == false)
            {
                if(count.containsKey(words[i]))
                {
                    count.put(words[i], count.get(words[i]) + 1);
                }
                else
                {
                    count.put(words[i], 1);
                }
            }
        }

        ArrayList<String> list = new ArrayList<String>(count.keySet());

        Collections.sort(list, (a, b) -> count.get(b) - count.get(a));

        for(int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i) + ": " + count.get(list.get(i)));
        }
    }

    public static void main(String[] args)
    {
        String feedback = "The mentor was great, the session was great and clear.";

        printFilteredWordFrequency(feedback);
    }
}
