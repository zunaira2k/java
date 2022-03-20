import java.util.Scanner;
public class Assignment02 {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a Number to check: ");
            int n = sc.nextInt();
            if(n%2 == 0){
                System.out.println(n+" is an even number");
            }
            else{
                System.out.println(n+" is a odd number");
            }
        }
    }
}
