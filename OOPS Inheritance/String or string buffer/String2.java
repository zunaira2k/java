import java.util.Scanner;

public class String2 {
    static void concatinate(String s1, String s2){
        int s1L = s1.length() -1;
        String s3;
        if(s1.charAt(s1L) == s2.charAt(0)){
            s3 = s1.substring(0, s1L)+s2;}
            else{
            s3 = s1+" "+s2;
        }
        System.out.print(s3.toLowerCase());
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two String that you wish to concatinate: ");
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        sc.close();
        concatinate(s1,s2);
    }
}
