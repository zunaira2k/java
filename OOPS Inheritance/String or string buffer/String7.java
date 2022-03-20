import java.util.Scanner;

public class String7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s1 = sc.next();
        int len = s1.length();
        sc.close();
        if(s1.charAt(0) == 'X' || s1.charAt(0) == 'x'){
           String s =  s1.substring(1, len);
            if(s1.charAt(len-1) == 'X' || s1.charAt(len-1) == 'x'){
                System.out.println(s.substring(0, len-2));
            }
            else{System.out.println(s);}

        }
        else if(s1.charAt(len-1) == 'X' || s1.charAt(len-1) == 'x'){
            String s =  s1.substring(0,len-1);
            System.out.println(s);
        }
        else{
            System.out.println(s1);
        }
    }    
}
