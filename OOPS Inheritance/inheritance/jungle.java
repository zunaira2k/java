package inheritance;
class Animal {
    void cat(){
        System.out.println("I am from Animal class");
    }
    void sleep(){
        System.out.println("I am from Animal class");
    }

}
class Bird extends Animal{
    void cat(){
        System.out.println("I am from bird class");
    }
    void sleep(){
        System.out.println("I am from bird class");
    }
    void fly(){
        System.out.println("I am from Bird class");
    }
}
class jungle{
 public static void main(String[] args) {
     Animal a = new Animal();
     a.cat();
     a.sleep();
     Bird b = new Bird();
     b.cat();
     b.sleep();
     b.fly();
 }
}

