import java.util.Random;

abstract class Compartment{

    public abstract String notice();
}

class FirstClass extends Compartment{

    @Override
    public String notice() {
        return "You are in FIRSTCLASS";
    }
}

class Ladies extends Compartment{

    @Override
    public String notice() {
        
        return "You are in LADIES";
    }
    
}

class General  extends Compartment{

    @Override
    public String notice() {
    
        return "You are in GENERAL";
    }
    
}

class Lagguage extends Compartment{

    @Override
    public String notice() {
        
        return "You are in LAGGUAGE";
    }

}


class TestCompartment{
    public static void main(String[] args) {
     Compartment[] c = new Compartment[10];

     Random r = new Random();

     for(int i = 0 ; i < 10; i++){
         int randnum = r.nextInt(3+1)+1;
         if(randnum == 1)
             c[i] = new Lagguage();
         else if(randnum == 2)
            c[i] = new Ladies();
         else if(randnum == 3)
            c[i] = new General();
         else if(randnum == 4)
            c[i] = new FirstClass();

       System.out.println(c[i].notice());
     }

    }
}