public class Swapping2Numbers {
    public static void main(String Arg[])
    {
        int a = 10,b = 20;
        System.out.println("before swapping value.. "+a+"  "+b);
         /*logic 1
        int t = a;
        a = b;
        b = t;
        */

        // logic 2 without third variable
       /*  a = a + b;
        b = a - b;
        a = a - b;*/


        // logic 3 
       /*  a = a * b; // 10 * 20 = 200
        b = a/b;  // 200/20 = 10 

        a = a/b; // 200/10 = 20 */

        // logic 4 single statement

        b = a+b-(a=b);

        System.out.println("after swapping value are.."+a+"   "+b);
        

    }
}