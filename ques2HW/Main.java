package ques2HW;

public class Main
{
    static void parseStudentRecord(String csvLine)
    {
        String[] data = csvLine.split(",");

        if(data.length != 3)
        {
            System.out.println("Invalid Record");
        }
        else
        {
            System.out.println("Name: " + data[0]);
            System.out.println("Roll No: " + data[1]);
            System.out.println("Dept: " + data[2]);
        }
    }

    public static void main(String[] args)
    {
        String record = "Ananya Verma,RA2211003010123,CSE";

        parseStudentRecord(record);
    }
}
