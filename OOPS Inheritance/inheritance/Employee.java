package inheritance;

public class Employee extends Person {
    
    double annualSalary;
    int yearOfJoining;
    String insuranceNo;

    Employee( String name, double annualSalary, int yearOfJoining, String insuranceNo){
        super(name);
        this.annualSalary = annualSalary;
        this.yearOfJoining = yearOfJoining;
        this.insuranceNo = insuranceNo;
    }
    public double getAnnualSalary() {
        return annualSalary;
    }

    public int getYearOfJoining() {
        return yearOfJoining;
    }

    public String getInsuranceNo() {
        return insuranceNo;
    }
}
