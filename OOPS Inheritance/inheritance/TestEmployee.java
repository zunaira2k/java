package inheritance;

public class TestEmployee {
    public static void main(String[] args) {
        Employee e = new Employee("Zunaira", 500000.0, 2022, "HUWDG221");
        System.out.println("Details of Employee: ");
        System.out.println("Name: "+e.getName());
        System.out.println("Annual Salary: "+e.getAnnualSalary());
        System.out.println("Year of Start: "+e.getYearOfJoining());
        System.out.println("Insurance Number :"+e.getInsuranceNo());
    }
}
