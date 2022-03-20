import java.util.Scanner;

public class String9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Strings: ");
        String s1 = sc.nextLine();
        String s2 = sc.nextLine(); 
        sc.close();
        String bigstr = s1.length()> s2.length() ? s1:s2;
        String smallstr = s1.length() < s2.length() ? s1:s2;
        String res =" ";

        for(int i = 0; i < smallstr.length(); i++){
            res = res + s1.charAt(i);
            res = res + s2.charAt(i);
        }

        res = res+bigstr.substring(smallstr.length(), bigstr.length());
        System.out.println(res);
    }
}
