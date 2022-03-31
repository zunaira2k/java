import java.io.*;
import java.util.Scanner;

public class Assignment1{
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the file name");
        String filename = sc.nextLine();
        System.out.println("Enter Character that you wish to be counted ");
        char c = sc.nextLine().charAt(0);

        File file = new File(filename);
        int charcount = 0;

        BufferedReader br = new BufferedReader(new FileReader(file));

        int ch;
        do{
             ch = br.read();
             if(ch >= 65 && ch <= 90){
                 ch += 35;
             }
             if(c >= 65 && c <= 90){
                 c +=35;
             }
             if(ch == c){
                 charcount++;
             }
        }
        while(ch != -1);

        System.out.println(charcount);
       br.close();
       sc.close();
    }
}