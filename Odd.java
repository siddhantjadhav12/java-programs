import java.util.*;

public class Odd{
    public static void printSum(int n)
    {
        int sum = 0;

        for(int i = 0;i <=n;i++)
        {
            if(i % 2 !=0)
            {
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }
    public static void main(String Arg[])
    {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        printSum(n);
    }
}