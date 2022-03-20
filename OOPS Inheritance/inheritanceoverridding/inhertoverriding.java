package inheritanceoverridding;
class Fruit{
    
    String name;
    String Taste;
    String size;

    void eat(){
        System.out.println(" Eating fruits... ");
    }
}
 class Apple extends Fruit{
    
        Apple(String name, String Taste, String size){
        //    name = "Apple";
        //    Taste = "Sweet";
        this.name = name;
        this.Taste = Taste;
        this.size = size;

        }
        Apple(){}
        @Override void eat(){
            System.out.println(name+" is a fruit and taste "+Taste+" and its "+size+" in size. ");
        }
    }

class Orange extends Fruit{
        Orange(){
            name = "Orange";
            Taste = "Sweet and Sour";
        }
        @Override void eat(){
            System.out.println(name+" is a fruit and taste "+Taste+" and its "+size+" in size. ");
        }
    }

public class inhertoverriding{

    public static void main(String[] args) {
        Fruit f = new Fruit();
        Apple a = new Apple("Apple","Sweet","Circle");
        Orange o = new Orange();
        f.eat();
        a.eat();
        o.eat();
    }
}
