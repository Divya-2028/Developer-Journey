package classobject;
class Rectangle{
    int length;
    int width;
    Rectangle(int length,int width){
        this.length=length;
        this.width=width;

    }
    public void area(){
        int a=length*width;
        System.out.println("Area of rectangle= "+a);
    }
}
class Circle{
    float radius;
    float pi=3.14F;
    Circle(float radius){
        this.radius=radius;
    }
    public void area(){
        float r=radius*radius;
        System.out.println("Area of circle= "+r);
    }
}
public class Shape {
    public static void main(String[] args) {
        Rectangle r1=new Rectangle(3,5);
        Circle c1=new Circle(5);
        c1.area();
        r1.area();
    }
}
