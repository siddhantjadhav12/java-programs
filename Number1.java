import java.util.*;

public class Number1
{
    public static void main(String Arg[])
    {
        int n = 5;
        

         for(int i = 1;i<=n;i++)
        {
            for(int j=1;j<=n-i+1;j++) 
            {
                System.out.print(" "+j);

            }
            System.out.println();
        }
    }
}