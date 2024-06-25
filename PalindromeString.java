import java.util.*;
public class PalindromeString {
    public static void main(String Args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter you string:");

        String str = sc.next();  
        String org_str = str;

        String rev="";

        int len = str.length();

        for(int i=len-1;i>=0;i--)
        {
            rev = rev+str.charAt(i);

        }
        if(org_str == rev)
        {
            System.out.println("string is palindrome" +org_str);
        }
        else{
            System.out.println("string is not a palindrome"+org_str);
        }

    }
}