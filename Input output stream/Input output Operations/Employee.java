import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

import javax.xml.transform.Source;


public class Employee implements java.io.Serializable {
    String name;
    Date  dateOfBirth;
    String department;
    String designation;
    double Salary;


    
    public Employee() {
    }
    public Employee(String name, Date dateOfBirth, String department, String designation, double salary) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.department = department;
        this.designation = designation;
        Salary = salary;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Date getDateOfBirth() {
        return dateOfBirth;
    }
    public void setDateOfBirth(Date date) {
        this.dateOfBirth = date;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public String getDesignation() {
        return designation;
    }
    public void setDesignation(String designation) {
        this.designation = designation;
    }
    public double getSalary() {
        return Salary;
    }
    public void setSalary(double salary) {
        Salary = salary;
    }
    
    @Override
    public String toString() {
        return "Employee [Salary=" + Salary + ", dateOfBirth=" + dateOfBirth + ", department=" + department
                + ", designation=" + designation + ", name=" + name + "]";
    }
    public static void main(String[] args) {
   Employee e = new Employee();
   Date s = new Date(8);
   s.setDate(8);
   s.setMonth(2);
   s.setYear(99);
   e.setName("XYZ");
   e.setDateOfBirth(s);
   System.out.println(e.getDateOfBirth());
   e.setDepartment("Computer Science");
   e.setDesignation("Project intern");
   e.setSalary(10000.50);

   try{
       FileOutputStream fout = new FileOutputStream("DATA.ser");
       ObjectOutputStream out = new ObjectOutputStream(fout);
       out.writeObject(e);
       out.close();
       fout.close();
       System.out.println("serialized data is saved");
       FileInputStream fin = new FileInputStream("DATA.ser");
       ObjectInputStream in = new ObjectInputStream(fin);
       Employee e1 = (Employee)in.readObject();
       in.close();
       System.out.println("Name: "+ e.getName());
       System.out.println("D.O.B: "+ e.getDateOfBirth());
       System.out.println("Department: "+e.getDepartment());
       System.out.println("Designation: "+e.getDesignation());
       System.out.println("Salary: "+e.getSalary());
   }
   catch(IOException | ClassNotFoundException i){
       i.printStackTrace();
   }



    }
}


