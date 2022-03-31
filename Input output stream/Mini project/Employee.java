import java.io.Serializable;

class Employee implements Serializable{
    int empId;
    String empName;
    int empAge;
    double Salary;
    
    public Employee(){
    }
    
    public Employee(int empId, String empName, int empAge, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.empAge = empAge;
        Salary = salary;
    }
    
    public int getEmpId() {
        return empId;
    }
    public void setEmpId(int empId) {
        this.empId = empId;
    }
    public String getEmpName() {
        return empName;
    }
    public void setEmpName(String empName) {
        this.empName = empName;
    }
    public int getEmpAge() {
        return empAge;
    }
    public void setEmpAge(int empAge) {
        this.empAge = empAge;
    }
    public double getSalary() {
        return Salary;
    }
    public void setSalary(double salary) {
        Salary = salary;
    }
    
    @Override
    public String toString() {
        return "Employee [Salary=" + Salary + ", empAge=" + empAge + ", empId=" + empId + ", empName=" + empName + "]";
    }
}