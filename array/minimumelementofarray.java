package array;
import java.util.Scanner;
public class minimumelementofarray {
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
        int min=Integer.MAX_VALUE;

        for(int i=0;i<n;i++)
        {
            if(min>a[i])
                min=a[i];
        }
        System.out.println("The maximum element of is "+" "+min);
    }
    
}
