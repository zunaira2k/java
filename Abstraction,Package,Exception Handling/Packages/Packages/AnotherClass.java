package Packages;
import testpackage.foundation;

public class AnotherClass {
    public static void main(String[] args) {
        foundation f = new foundation();
        f.var1 = 5;
        // f.var2 = 10;
        // f.var3 = 15;
        // f.var4 = 20;
        // they all are not visible

        System.out.println(f.var1);
       
    }

}
