import java.util.Scanner;

public class String1 {

    static Boolean isPalindrome(String s){
        Boolean res = true;
        for(int i = 0; i < s.length()/2; i++){
            if(s.charAt(i) != s.charAt(s.length() - i - 1)){
                res = false;
            }
        }
        return res;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String to check: ");
        String s = sc.nextLine();
        sc.close();
        System.out.println(isPalindrome(s));
    }
}
