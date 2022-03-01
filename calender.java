import java.util.Scanner;
public class calender {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter month: ");
        int n = sc.nextInt();
        String arr[] = {"Januaray","February","March","April","May","June","July","August","September","October","Nevembeer","December"};
        System.out.println(arr[n-1]);
    }
    
}
