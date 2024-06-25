import java.util.*;

public class Calculator
{
    public static void main(String Arg[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int operator = sc.nextInt();
        int result = 0;
        
        switch(operator){
            case 1 : result = a+b;
            break;
            case 2 : result = a-b;
            break;
            case 3 : result = a*b;
            break;
            case 4 : if(b != 0){
                result = a / b;
            } else{
               System.out.println("invalid Dividion");

            }
            break;
            case 5 : if(b == 0){
               result = a % b;
            } else {
               System.out.println("invalid division");

            }
            break;
            default : System.out.println("invalid opertor");
            
       
        }

    }
}