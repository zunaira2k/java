import java.util.Scanner;
class box{

    double width;
    double breath;
    double depth;

    box(double w, double b, double d)
    {
     width = w;
     breath = b;
     depth = d;
    }
    
    double volume()
    {
        return width * breath * depth;
    }


    public static void main(String[] args) {
    { Scanner sc = new Scanner(System.in);
        System.out.println("Enter width, breath and depth of the box");
       double x = sc.nextDouble();  
       double y = sc.nextDouble(); 
       double z = sc.nextDouble();  
       sc.close(); 
      box b = new box( x,  y,  z);
      System.out.println("Volume of the box = "+b.volume());
    }

    }
}
