import java.util.Scanner;

public class String3 {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the string: ");
     String s1 = sc.next();
     int len = s1.length();
     sc.close();
     String s2 = s1.substring(0, 2);
     String res = "";
      for(int i = 0; i < len ; i++){
          res = res+s2;
      }
      System.out.println(res);
    }
}
