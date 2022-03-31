import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class TestEmployee {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        String filename = "Employee";
        FileOutputStream fout = new FileOutputStream(filename);
        ObjectOutputStream out = new ObjectOutputStream(fout);

        FileInputStream fin = new FileInputStream(filename);
        ObjectInputStream in = new ObjectInputStream(fin);
        boolean loop = true;

       do{ 
       System.out.println("Main Menu");
       System.out.println("1. Add an Employee");
       System.out.println("2. Display All");
       System.out.println("3. Exit");
       choice = sc.nextInt();

       switch(choice)
       {
           case 1:
               Employee emp = new Employee();
               System.out.println("Enter the Employee ID: ");
               emp.setEmpId(sc.nextInt());
               System.out.println("Enter the Employee name: ");
               emp.setEmpName(sc.next());
               System.out.println("Enter the Employee Age: ");
               emp.setEmpAge(sc.nextInt());
               System.out.println("Enter the employee Salary: ");
               emp.setSalary(sc.nextDouble());
               out.writeObject(emp);
               break;
          case 2:
              System.out.println("----Report----");
              emp = null;
              while(fin.available() > 0){
                  emp = (Employee)in.readObject();
                  System.out.println(emp);
              }
              System.out.println("----End of Report----");
              break;
          case 3:
              System.out.println("Exiting the system");
              loop = false;
              break;    
       }
    } while(loop);

    sc.close();
    in.close();
    out.close();

}
}
