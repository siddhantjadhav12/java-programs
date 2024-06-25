import java.util.*;
class PushZero
{
   static void PushZeroToEnd(int arr[],int n)
    {
        int count = 0;

        for(int i = 0;i <n;i++)
        if(arr[i] != 0)
        arr[count++] = arr[i];

        while(count < n)
        arr[count++]=0;
    }
    public static void main(String Arg[])
    {
        int arr[] = {1,3,5,6,0,4,0,2,0,6};
        int n = arr.length;
        PushZeroToEnd(arr,n);
        System.out.println("array after pushing zeros to the back:");
        for(int i = 0;i<n;i++)
        System.out.print(arr[i]+" ");
        

    }
} 