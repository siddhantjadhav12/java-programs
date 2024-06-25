interface Animal{
    public void walk();

}

interface herbivore {
    
}

class Horse implements Animal,herbivore{
    public void walk(){
    System.out.println("walks on 4 legs");

    }
}

public class Interface{
    public static void main(String Args[]){
        Horse horse = new Horse();
        horse.walk();
    }
}