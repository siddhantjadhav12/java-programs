import java.util.*;

public class Halfone
{
    public static void main(String Arg[])
    {
        int n = 4;
        

        for(int i = 1;i<=n;i++)
        {
            for(int j=1;j<=n-1;j++) 
            {
                
                System.out.print(" "); 
                
            }
            for(int j=1;j<=i;j++) 
            {
                
                System.out.print("*"); 
            }
            System.out.println();
        }

    }
}