import java.util.Scanner;
public class Assignment01b {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter first number: ");
            int a = sc.nextInt();
            System.out.println("Enter second number: ");
            int b = sc.nextInt();
            if(a%10 == b%10){
                System.out.println("true");
            }
            else{
                System.out.println("False");
            }
        }

    }
}
