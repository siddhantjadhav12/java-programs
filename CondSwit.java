import java.util.*;

public class CondSwit

{
    public static void main(String Arg[])
    {
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt(); 

        switch(button ){
            case 1 : System.out.println("hello");
            break;
            case 2 : System.out.println("namsate");
            break;
            case 3 : System.out.println("bonjour");
            break;
            default : System.out.println("invalid button"); 
        }

    }
}