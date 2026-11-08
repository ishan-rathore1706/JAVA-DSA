package array;
import java.util.Scanner;
public class maximumelementinanarraymethod2 {
    public static void main(String [] args)
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter size of array");
       int n=sc.nextInt();
   System.out.println("Enter elements of the array");
       int [] a=new int[n];
       for(int i=0;i<n;i++)
       {
         a[i]=sc.nextInt();
       } 
        int max=Integer.MIN_VALUE;

        for(int i=0;i<n;i++)
        {
            if(max<a[i])
                max=a[i];
        }
        System.out.println("The maximum element of is "+" "+max);
    }
    
}
