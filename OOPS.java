class Pen {
    String color;
    String type;

    public void write() {
        System.out.println("writting somenthing");
    }

    public void printcolor(){
        System.out.println(this.color);
    }

}

class Student {
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    Student(String name,int age){    // parametrized constrctor
        this.name = name;
        this.age = age;
    }

Student(Student s2){
    this.name = s2.name;
    this.age = s2.age;
}

Student(){

}
}
public class OOPS {
    public static void main(String Args[])
    {
        Pen pen1 = new Pen();
        pen1.color = "blue";
        pen1.type = "gel";


        Pen pen2 = new Pen();
        pen2.color = "black";
        pen2.type = "ballpoint";

        pen1.printcolor();
        pen2.printcolor();

        pen1.write();

        Student s1 = new Student();
        s1.name = "sidd";
        s1.age = 23;

        Student s2 = new Student(s1);   // copy constructor

        s1.printInfo();
    }
} 