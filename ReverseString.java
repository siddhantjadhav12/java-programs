
public class ReverseString {
    public static void main(String Arg[])
    {
        String str = "sidd";
        String rev ="";

       /*  int len = str.length();
        for(int i=len-1;i>=0;i--)
        {
            rev=rev+str.charAt(i);
        }
        System.out.println("reverse the string :"+ rev); 
*/
                  // using character array
        
           /* 
            char a[] = str.toCharArray();
            int len=a.length;

            for(int i=len-1;i>=0;i--)
            {
                rev = rev+a[i];
            }
            System.out.println("reverse string :"+rev);
            */

                      // using string buffer class

            StringBuffer sb = new StringBuffer(str);
            System.out.println(sb.reverse());

    }
}