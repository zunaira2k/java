import java.util.Scanner;
class Employee
{
    int empid;  //instance variable(object specific)
    String name; //instance variable
    int salary;
    static final double COMM = 0.25; //final variable
    static String compName = "WIPRO";

    Employee(int empId,String name, int salary)
    {
        empid = empId;
        this.name = name; // this- current class object
        this.salary = salary;
    }
    void display()
    {
        System.out.println("Employee Detail: Empid = "+empid+" Name = "+name+" Salary = "+salary+" Company name = " +compName);
    }
    public class TestEmployee1
{
    public static void main(String[] args){
    try (Scanner sc = new Scanner(System.in)) {
        System.out.println("Enter the employee details: Empid/Name/Salary");
        int empid = sc.nextInt();
        String name = sc.next();
        int salary = sc.nextInt();

        Employee e1 = new Employee(empid,name,salary);
        e1.display();
    }
    }
}
}

