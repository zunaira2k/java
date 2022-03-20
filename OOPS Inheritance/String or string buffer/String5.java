import java.util.Scanner;


public class String5 {

    static String FirstLastCHar( String s){
        int len = s.length();
        
        return s.substring(1, len-1);
        

    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the String: ");
         String s1 = sc.next();
         sc.close();
         System.out.println(FirstLastCHar(s1));
         
    }
    
}
