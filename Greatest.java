import java.util.Scanner;
public class Greatest {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
        a[i] = sc.nextInt();
    }
    int max = Integer.MIN_VALUE;
    for(int i = 0; i < n; i++){
       if(a[i] > max){
           max = a[i];
       }
    }
    System.out.println(max);
    }
}
