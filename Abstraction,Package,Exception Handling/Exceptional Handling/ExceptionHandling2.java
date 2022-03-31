import java.util.Scanner;

public class ExceptionHandling2 {
    public static void main(String[] args) {
        try{
            
            for(int i = 0; i < 2; i++){
                Scanner sc = new Scanner(System.in);
                String Name = sc.next();
                int math, physics, chemistry;
                if(sc.hasNextInt()){
                 math = sc.nextInt();
                if(math < 0){
                    throw new NegativeValue();
                }
                if(math > 100){
                    throw new OutOfRangeValue();
                }
                }
                else{
                    throw new NumberFormatException();
                } 
                 if(sc.hasNextInt()){
                physics = sc.nextInt() ;
                if(physics < 0){
                    throw new NegativeValue();
                }
                if(physics > 100){
                    throw new OutOfRangeValue();
                }
                }
                else{
                    throw new NumberFormatException();
                }
                if(sc.hasNextInt()){
                chemistry = sc.nextInt();
                if(chemistry < 0){
                    throw new NegativeValue();
                }
                if(chemistry > 100){
                    throw new OutOfRangeValue();
                }
                }
                else{
                    throw new NumberFormatException();
                    
                }
                StudentDetails s = new StudentDetails(Name,physics,math,chemistry);
                System.out.println(s.Avg());
            }
        
        }
        catch(NumberFormatException e){

            System.out.println("Please Enter Only Integer Value! ");
        }

        catch(NegativeValue e){

            System.out.println("Only Positive Values! ");
        }
        catch(OutOfRangeValue e){
            System.out.println("Marks should be between 0 to 100! ");
        }

    }
}

class StudentDetails{
    String Name;
    int math;
    int physics;
    int chemistry;

    public StudentDetails(){}

    public StudentDetails(String name, int math, int physics, int chemistry) {
        this.Name = name;
        this.math = math;
        this.physics = physics;
        this.chemistry = chemistry;
    }
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public int getMath() {
        return math;
    }
    public void setMath(int math) {
        this.math = math;
    }
    public int getPhysics() {
        return physics;
    }
    public void setPhysics(int physics) {
        this.physics = physics;
    }
    public int getChemistry() {
        return chemistry;
    }
    
    public void setChemistry(int chemistry) {
        this.chemistry = chemistry;
    }
    
    int Avg(){
        int sum = 0;
        sum = this.physics+this.chemistry+this.math;
        return sum/3;

    } 
}
class NegativeValue extends Exception{

    public NegativeValue(){
        super();
    }

    public NegativeValue(String msg){
        super(msg);
    }
}

class OutOfRangeValue extends Exception{

    public OutOfRangeValue()
    {
        super();
    }

    public OutOfRangeValue(String msg){
        super(msg);
    }
}