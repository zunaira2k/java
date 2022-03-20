import java.util.Scanner;
public class Assignment01a {
    public static void main(String[] a) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a Number: ");
            int n = sc.nextInt();
            if(n < 0){
                System.out.println(n+" is a negative number");
            }
            else if(n > 0){
                System.out.println(n+" is a positive number");
            }
            else{
                System.out.println("zero");
            }
        }
        
    }
}
