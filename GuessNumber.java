import java.util.Scanner;

public class GuessNumber
{
    public static void main( String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int myNumber = (int)(Math.random()*100);
        int userNumber = 0;

        do {
            System.out.println("guess any number : ");
             userNumber = sc.nextInt();

            if(userNumber == myNumber)
            {
               System.out.println("WOOHOO  .. CORRECT NUMBER!!!");
               break;

            }
            else if(userNumber > myNumber)
            {
                System.out.println("your number is to large");
                
            }
            else{
                System.out.println("your number is to small");
            }

        }
        while(userNumber >= 0);
        System.out.println("my number was :");
        System.out.println(myNumber);
    }
}