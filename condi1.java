import java.util.*;

public class Condi1
{
    public static void main(String Arg[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a == b)
        {
            System.out.println("equal");

        }
        else
         if(a > b)
        {
            System.out.println(" a is greater");
            
        }
        else
        {
            System.out.println("a is lesser");
        }

    }
}