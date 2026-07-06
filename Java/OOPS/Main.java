package OOPS;
class Car{
    String brand;
    String model;
    String price;
    Car(String brand,String model,String price){
        this.brand=brand;
        this.model=model;
        this.price=price;
        System.out.println("Brand: "+brand + " Model: "+model+ " Price: " + price);
    }
}
public class Main {
    public static void main(String[] args){
        Car c1=new Car("BMW","M5","1 lakh");

    }
}
