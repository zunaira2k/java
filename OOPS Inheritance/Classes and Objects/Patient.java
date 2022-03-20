import java.util.*;
public class Patient {
    String  patientName;
    double  height;
    double weight;

    Patient(String name, double h, double w){
    patientName = name;
    height = h;
    weight = w;
    }

    double computeBMI(){
        return weight/height*height;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        sc.close();

        Patient p1 = new Patient(a,b,c);
        System.out.println(a+p1.computeBMI());
    }
}
