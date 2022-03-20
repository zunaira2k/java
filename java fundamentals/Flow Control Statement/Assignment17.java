import java.util.Scanner;
public class Assignment17 {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            String s = sc.nextLine();
            int low = 0;
            int high = s.length()-1;
            boolean flag = true;
            while(high>low){
                if(s.charAt(low) == s.charAt(high)){
                    low++;
                    high--;
                }
                else{
                    flag = false;
                    break;
                }
            }
            if(flag){
                System.out.println(s+" is palindrome");
            }
            else{
                System.out.println(s+" is not palindrome");
            }
        }
    }
        
    
}
