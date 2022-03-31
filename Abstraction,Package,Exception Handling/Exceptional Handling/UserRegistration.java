import java.util.Scanner;

class InvalidCountryException extends Exception{
    public InvalidCountryException(){
         System.out.println("User Outside India cannot be regitered! ");
    }
    
}
public class UserRegistration
{
    void registerUser(String username, String userCountry) throws InvalidCountryException
        {
            if(!userCountry.equals("India") && !userCountry.equals("INDIA") && !userCountry.equals("india")){
                throw new InvalidCountryException();
            }
            else{
                System.out.println("User registration done successfully");
            }

        }
    public static void main(String[] args) {
        String username;
        String userCountry;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        username = sc.next();
        System.out.println("Enter your Country name: ");
        userCountry = sc.next();

        UserRegistration u = new UserRegistration();
        try {
            u.registerUser(username, userCountry);
        } catch (InvalidCountryException e) {
          
        }

        
    }    

 
}
