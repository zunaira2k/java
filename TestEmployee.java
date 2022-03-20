import java.util.Scanner;
class Employee
{
    int empid;  //instance variable(object specific)
    String name; //instance variable
    int salary;
    static final double COMM = 0.25; //final variable
    static String compName = "WIPRO";
    Employee(){

    }

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
    int calcSal(){ //user defined method
        int newSal = 0; //local variable
        //code
        return newSal;
    }

public class TestEmployee
{
    public static void main(String[] args, int i){
    try (Scanner sc = new Scanner(System.in)) {
        Employee e1 = new Employee(); //default/ non parameter constructor- initialise the object e1
        System.out.println("Enter the employee details: Empid/Name/Salary");
        e1.empid = sc.nextInt();
        e1.name = sc.next();
        e1.salary = sc.nextInt();
        e1.display();
    }
    Employee e2 = new Employee(20000," Zuniara ", 5000000);
        e2.display();
    
    }
}
}
