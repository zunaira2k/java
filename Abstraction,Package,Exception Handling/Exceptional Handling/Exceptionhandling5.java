class ageException extends Exception{
    public ageException(){
        super();
    }
    public ageException(String msg){
        super(msg);
    }
}
public class Exceptionhandling5 {
    public static void main(String[] args) {
        try{
        int age = Integer.parseInt(args[1]);
        if(age < 18 || age >= 60)
        {
            throw new ageException("Age should be between 18 to 60");
        }
    }
    catch(ageException e){
        System.out.println(e);
    }
    }
}
