import java.util.Scanner;

public class String6 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String1:"
        +"String2: ");
        String s1 = sc.next();
        String s2 = sc.next();
        sc.close();
        if(s1.length() > s2.length()){
            System.out.println(s2+s1+s2);
        }
        else if(s2.length() > s1.length()){
            System.out.println(s1+s2+s1);
        }
        else{
            System.out.println("Both string can not be of same length");
        }
    }
}
