import java.util.Scanner;
public class Assignment09 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter month: ");
            int n = sc.nextInt();
            String arr[] = {"Januaray","February","March","April","May","June","July","August","September","October","Nevembeer","December"};
            if(n<1 || n>12){
                System.out.println("Invalid Month");
            }
            else{
            System.out.println(arr[n-1]);
            }
        }
    }
    
}
