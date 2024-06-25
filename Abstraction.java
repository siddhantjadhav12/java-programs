abstract class Animal {
    abstract void walk();
    public void eat(){
        System.out.println("Animal eat");

    }

    }


class Horse extends Animal{
    public void walk(){
        System.out.println("walk on 4 legs");
    }
}

class Chicken extends Animal {
    public void walk(){
        System.out.println("walks on 2 legs");
    }
}

public class Abstraction{
    public static void main(String Args[])
    {
        Horse horse = new Horse();
        horse.walk();
        horse.eat();
    }
}