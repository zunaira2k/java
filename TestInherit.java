class Person
{
      String name;
      int age;
      Person()
      {
      
      }
      Person(String name,int age)
      {
          this.name=name;
          this.age=age;
      }
      void display()  //instance method
      {
          System.out.println("Name= "+name+" Age= "+age);
      }
}

class Student extends Person //Studnt IS-A type of Person
{
      //String name;
      //int age;
      int rNo;
      int score;
      String course;
      String grade;
      Student()
      {
            //super();
      }
      Student(String name,int age,int rNo,int score , String course)
      {
            super(name,age);
           // this.name=name;
            //this.age=age;
            this.rNo=rNo;
            this.score=score;
            this.grade=this.calcGrade();
            this.course=course;
      }
      void display() //instance
      {
       super.display();  //super - parent obj
           System.out.println("RNo= "+rNo+" Score= "+score+" Grade="+grade+" Course"+course);         
      }
      String calcGrade() //instance method
      {
          String studGrade="";
          if(score >= 90 && score <=100)
                studGrade="A";
          else if(score >=80 && score <90)
                studGrade="B";
          else if(score >=70 && score < 80)
                studGrade ="C";
          else
                studGrade="D";
          return studGrade;
      }
}
class Employee1 extends Person
 //Employee IS-A person
    {
     int empid;
     int salary;
     String course;

      Employee1()
      {}
      Employee1(String name, int age, int empid, int salary)
      {
      super(name,age);
      this.empid = empid;
      this.salary = salary;
      }
      Employee1(String name, int age, int empid)// constractor is overlodded
      {
            super(name,age);
            this.empid = empid;
      }
      void display(){
       super.display();
       System.out.println("EmpId: "+empid+"Salary: "+salary);
       }
     int calNewSal()
       {
      int newSal = 0;
      newSal = salary + 1000;
      return newSal;
       }  
} 
class HourlyEmployee extends Employee1{
      int chargePerHour;
      int noOfHours;
      HourlyEmployee(String name, int age, int contractID,int chargePerHour, int noOfHours){
         super(name,age,contractID);
         this.chargePerHour = chargePerHour;
         this.noOfHours = noOfHours;
         this.salary = clacSal();
      } 
      int clacSal()
      {
            int newSal = 0;
            newSal = chargePerHour*noOfHours;
            return newSal;
      }
      void display()
      {
            super.display();
            System.out.println("Charge Per Hours: "+chargePerHour+" No. of Hours: "+noOfHours);
      }
}
 class TestInherit
{
    public static void main(String[] a)
    {
        System.out.println("Person");
        Person p=new Person("John",20);
        p.display();
        System.out.println("Student:");
        Student s1=new Student("John",20,1,96,"Btech");
        s1.display();
        System.out.println("Employee: ");
        //Student s2=new Student(); 
        //s2.display();
        Employee1 e = new Employee1("johnson",30,100,45000);
        e.display();
        System.out.println("Hourly Employee");
        HourlyEmployee he = new HourlyEmployee("johnny", 29, 12546, 45, 1000);
        he.display();
    }
}