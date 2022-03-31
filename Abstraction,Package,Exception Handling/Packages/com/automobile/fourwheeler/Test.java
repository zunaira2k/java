package com.automobile.fourwheeler;
import com.automobile.vehicle;

class Logon extends vehicle{

    private String ModelName;
    private String registrationNumber;
    private String ownerName;
    private int speed;
    private int gps;

    Logon(String Mn,String Rn, String On, int speed, int gps ){
        ModelName = Mn;
        registrationNumber = Rn;
        ownerName = On;
        this.speed = speed;
        this.gps  = gps;
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

    public int speed(){
        return speed;
    }

    public int gps(){
        return gps;
    }
    
}

class Ford extends vehicle{

    private String ModelName;
    private String registrationNumber;
    private String ownerName;
    private int speed;
    private int tempComtrol;

    Ford(String Mn,String Rn, String On, int speed, int tempComtrol ){
        ModelName = Mn;
        registrationNumber = Rn;
        ownerName = On;
        this.speed = speed;
        this.tempComtrol  = tempComtrol;
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

    public int speed(){
        return speed;
    }

    public int tempComtrol(){
        return tempComtrol;
    }
    
}
public class Test {
    public static void main(String[] args) {
        Logon l = new Logon("Mahindra Logan", "MP68MC6060", "ZUNAIRA KHAN", 180, 1);
        System.out.println(l.getModelName());
        System.out.println(l.getRegistrationNumber());
        System.out.println(l.getOwnerName());
        System.out.println(l.speed());
        System.out.println(l.gps());

        Ford f = new Ford("Ford Ecosport", "MP68MC6060", "ZUNAIRA KHAN", 170, 1);
        System.out.println(f.getModelName());
        System.out.println(f.getRegistrationNumber());
        System.out.println(f.getOwnerName());
        System.out.println(f.speed());
        System.out.println(f.tempComtrol());
    }
}
