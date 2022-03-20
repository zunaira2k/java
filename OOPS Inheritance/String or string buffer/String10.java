import java.util.Scanner;

public class String10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s = sc.next();
        System.out.println("Enter the no. between 0 to lenght of the String: ");
        int n = sc.nextInt();
        sc.close();
        String str = s.substring(s.length()-n, s.length());

        String res = "";
        for(int i = 0; i < n; i++){
            res = res+str;
        }
        System.out.println(res);
    }
}
