import java.util.Scanner;

public class String8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s1 = sc.next();
        sc.close();
        String[] star = s1.split(".[\\*]+.");

        System.out.println(star);
        StringBuffer sb = new StringBuffer();
        for (String x : star)
			sb.append(x);
		
		System.out.println(sb);
	

    }
}
