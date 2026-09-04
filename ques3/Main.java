package ques3;

public class Main
{
    static String getBmiStatus(double bmi)
    {
        if(bmi < 18.5)
        {
            return "Underweight";
        }
        else if(bmi < 25)
        {
            return "Normal";
        }
        else if(bmi < 30)
        {
            return "Overweight";
        }
        else
        {
            return "Obese";
        }
    }

    static void printWellnessReport(double[] heights, double[] weights)
    {
        for(int i = 0; i < heights.length; i++)
        {
            double bmi = weights[i] / (heights[i] * heights[i]);

            System.out.println("Person " + (i + 1));
            System.out.println("Height: " + heights[i] + " m");
            System.out.println("Weight: " + weights[i] + " kg");
            System.out.println("BMI: " + bmi);
            System.out.println("Status: " + getBmiStatus(bmi));
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        double[] heights = {1.75, 1.60, 1.70};
        double[] weights = {70, 90, 60};

        printWellnessReport(heights, weights);
    }
}
