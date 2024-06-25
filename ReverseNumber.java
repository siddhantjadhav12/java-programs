import java.util.*;
public class ReverseNumber {

    public static void main(String Arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enetr a number ");
        int num=sc.nextInt();

        int rev=0;

        while(num!=0)
        {
            rev=rev*10 + num%10; // 0+1234%10=4  40+3=43  430+2 = 432  4320+1=4321
            num = num/10;  // 1234/10 = 123   123/10=12  12/10 = 1  1/10=1 
        }   
        System.out.println("reverse number is" +rev);

            // using stringbuffer class
         

           /*  StringBuffer sb=new StringBuffer(String.valueOf(num));
            StringBuffer rev =sb.reverse();
        System.out.println("reverse number is:"+rev);*/ 

              // using Stringbuilder class

          /*   StringBuilder sbl =new StringBuilder();
            sbl.append(num);
            StringBuilder rev= sbl.reverse();
            System.out.println("reverse number is:"+rev);

*/
            
           /*  
           int rever = 0;

           while(num!=0)
           {
            rever = rever*10 + num%10;
            num = num/10;
           }
            */

    }


    
}


