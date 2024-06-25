class Shape {
    public void area(){
        System.out.println("displays area");
    }
}

class Triangle extends Shape{
    public void area(int l,int h)
    {
        System.out.println(1/2*l*h);     //hierarchical inheritance
    }

}

class Circle extends Shape{
    public void area(int r)
    {
        System.out.println((3.14)*r*r);     
    }

}

public class Hierarchial{
    public static void main(String args[])
    {
        Triangle t1 = new Triangle();
        t1.area(4,5);
        Circle c1 = new Circle();
        c1.area(7);
        
    }
}