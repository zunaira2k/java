import java.util.*;
import java.lang.Math;
class calculator {
     static int powerInt(int num1, int num2){
        return  (int) Math.pow(num1,num2);
    }
    static double powerDouble(double num1, int num2){
        return Math.pow(num1,num2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
    System.out.println(powerInt(a, b));
    System.out.println(powerDouble(a, b));
    }
}