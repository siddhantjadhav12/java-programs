import java.util.*;

public class Prime
{
    public static void main(String Arg[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        boolean isPrime = true;
        for(int i = 2;i<=n/2;i++)
        {
            if(n % i == 0)
            {
                isPrime = false;
                break;
            }
        }
        if(isPrime){
          
            if(n == 1)
            {
                System.out.println("this is not a prime number or compositive");

            }
             else{
                System.out.println("this is prime");

            }
            if else{
                System.out.println("this is not a prime number");
            }
        }

    }
}