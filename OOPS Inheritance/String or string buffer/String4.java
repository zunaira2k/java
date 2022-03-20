import java.util.Scanner;

public class String4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     System.out.println("Enter the string: ");
     String s1 = sc.next();
     int len = s1.length();
     sc.close();
     if(len%2 == 0){
         System.out.println(s1.substring(0, len/2));
     }
     else{
         System.out.println("NULL");
     }
    }
}
