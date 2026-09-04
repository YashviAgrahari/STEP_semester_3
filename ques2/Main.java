package ques2;

class Employee
{
    String empId;
    double salary;

    Employee(String empId, double salary)
    {
        this.empId = empId;
        this.salary = salary;
    }

    void raiseSalary(double salary)
    {
        this.salary = this.salary + salary;
    }
}

public class Main
{
    public static void main(String[] args)
    {
        Employee[] employees = new Employee[4];

        employees[0] = new Employee("E-101", 40000);
        employees[1] = new Employee("E-102", 55000);
        employees[2] = new Employee("E-103", 62000);
        employees[3] = new Employee("E-104", 48000);

        for(int i = 0; i < 4; i++)
        {
            employees[i].raiseSalary(5000);

            System.out.println(employees[i].empId +
                    " | Final Salary: Rs " + employees[i].salary);
        }
    }
}
