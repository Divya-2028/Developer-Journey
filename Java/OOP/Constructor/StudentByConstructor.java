class Student{
    String name;
    int age;
    Student(){
        this("Unknown",0);
    }
    Student(String name){
        this(name,0);
    }
    Student(int age){
        this("Unknown",age);
    }
    Student(String name,int age){
        this.name=name;
        this.age=age;
    }
    void display(){
        System.out.println("Name: "+name+" Age: "+age);
    }
}
public class StudentByConstructor {
   public static void main(String[] args) {
        Student s1=new Student();
        Student s2=new Student("Hello");
        Student s3=new Student(18);
        Student s4=new Student("World",20);
        s1.display();
        s2.display();
        s3.display();
        s4.display();
    }
}
