package com.wipro.automobile.ship;

class Compartment{
    private double height;
    private double width;
    private double breath;

    Compartment(double height, double width, double breath){
        this.height = height;
        this.breath = breath;
        this.width = width;
    }

    @Override
    public String toString() {
        return "Compartment [breath=" + breath + ", height=" + height + ", width=" + width + "]";
    }

}
public class Package2 {
    public static void main(String[] args) {
        Compartment c = new Compartment(162.01, 171.06, 206.11);
        System.out.println(c);
    }
}
