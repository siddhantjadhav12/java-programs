import java.util.*;
public class PalindromeNumber {
    public static void main(String Args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");

        int num = sc.nextInt(); 

        int org_num = num;
        int rev = 0;

        while(num!=0)
        {
            rev = rev*10 + num%10;
            num = num / 10;
        }
        if(org_num ==rev)
        {
        System.out.println("palindrome number is:"+org_num);
        }
        else{
            System.out.println("number is not a palindrome"+org_num);
        }
    }
}