import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) throws IOException {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the input file name: ");
        String fin = sc.nextLine();
        System.out.println("Enter the output file name: ");
        String fout = sc.nextLine();

        File file_in = new File(fin);
        File file_out = new File(fout);

        FileReader in = new FileReader(file_in);
        FileWriter out = new FileWriter(file_out);

        int c;

        while( (c = in.read()) != -1)
        {
            out.write(c);
        }
        System.out.println("File is Copied");
        sc.close();
        in.close();
        out.close();
    }
}   