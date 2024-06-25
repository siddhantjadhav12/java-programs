import java.util.*;

public class Function2{
    public static int calculateMul(int a,int b){
        int sum = a * b;
        return sum;
    }
    public static void main(String Arg[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = calculateMul(a, b);

        System.out.println(sum);

        
    }
} 