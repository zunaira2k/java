package com.automobile.twowheeler;
import com.automobile.vehicle;


 class Hero extends vehicle {

    private String ModelName;
    private String registrationNumber;
    private String ownerName;
    private int speed;

    Hero(String Mn, String Rn, String On, int speed){
        ModelName = Mn;
        registrationNumber = Rn;
        ownerName = On;
        this.speed = speed;
    }

    @Override
    public String getModelName() {
        // TODO Auto-generated method stub
        return ModelName;
    }

    @Override
    public String getRegistrationNumber() {
        // TODO Auto-generated method stub
        return registrationNumber;
    }

    @Override
    public String getOwnerName() {
        // TODO Auto-generated method stub
        return ownerName;
    }

    public int getSpeed(){
        return speed;
        
    }

    public void radio(){
        System.out.println("Acessing the Radio");

    }
    
}

class Honda extends vehicle{

    private String ModelName;
    private String registrationNumber;
    private String ownerName;
    private int speed;

    Honda(String Mn, String Rn, String On, int speed){
        ModelName = Mn;
        registrationNumber = Rn;
        ownerName = On;
        this.speed = speed;

    }

    @Override
    public String getModelName() {
        // TODO Auto-generated method stub
        return ModelName;
    }

    @Override
    public String getRegistrationNumber() {
        // TODO Auto-generated method stub
        return registrationNumber;
    }

    @Override
    public String getOwnerName() {
        // TODO Auto-generated method stub
        return ownerName;
    }

    public int getSpeed(){
        return speed;
        
    }

    public void cdplayer(){
        System.out.println("Accessing CD Player");
    }

}

class Test{
    public static void main(String[] args) {
        Hero h = new Hero("Splender", "DL123ZUN", "ZUNAIRA KHAN", 100);
        System.out.println(h.getModelName());
        System.out.println(h.getRegistrationNumber());
        System.out.println(h.getOwnerName());
        System.out.println(h.getSpeed());
        h.radio();

        Honda h1 = new Honda("Honda revolt", "DL0803KHAN", "ZUNAIRA KHAN", 110);
        System.out.println(h1.getModelName());
        System.out.println(h1.getRegistrationNumber());
        System.out.println(h1.getOwnerName());
        System.out.println(h1.getSpeed());
        h1.cdplayer();
    
    }
}