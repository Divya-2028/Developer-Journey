class Area {
    double pi=3.14;
    public int calculateArea(int length,int bredth){
        return length*bredth;
    }
    public double calculateArea(double radius){
        return pi*radius*radius;
    }
    public int calculateArea(int side){
        return side*side;
    }
}
public class Shapes {
    public static void main(String[] args) {
        Area r=new Area();
        System.out.println("Area: "+r.calculateArea(4,5));
        System.out.println("Area: "+r.calculateArea(2.4));
        System.out.println("Area: "+r.calculateArea(4));

    }
}
