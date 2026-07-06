package OOPS;

class Student{
    String name;
    int rollNo;
    String branch;
    int maths;
    int chemistry;
    int physics;
    Student(String name,int rollNo,String branch,int maths,int chemistry,int physics){
        this.name=name;
        this.branch=branch;
        this.rollNo=rollNo;
        this.maths=maths;
        this.physics=physics;
        this.chemistry=chemistry;
    }
    public int CalculateTotal() {
        return maths+physics+chemistry;
    }
    public double percentage() {
        float p = (CalculateTotal() / 300F) * 100F;
        return p;
    }
    public void resultDisplay(){
        System.out.println("Name: "+name);
        System.out.println("Roll No: "+rollNo);
        System.out.println("Branch: "+branch);
        System.out.println("Total Marks: "+CalculateTotal());
        System.out.printf("Percentage: %.2f%n",percentage());
    }
}
public class OOPS {
    static void main(String[] args) {
        Student s1=new Student("HEllo",10,"CSE",69,54,98);
        s1.resultDisplay();
    }
}
