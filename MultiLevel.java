class Shape {
    public void area(){
        System.out.println("displays area");
    }
}

class Triangle extends Shape{
    public void area(int l,int h)
    {
        System.out.println(1/2*l*h);     //multi level inheritance
    }

}

class EquilateralTriangle extends Triangle{
    public void area(int l,int h)
    {
        System.out.println(1/2*l*h);     
    }

}

public class MultiLevel{
    public static void main(String args[])
    {
        
    }
}