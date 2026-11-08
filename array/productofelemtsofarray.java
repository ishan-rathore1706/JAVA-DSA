package array;
import java.util.Scanner;
public class productofelemtsofarray 
    
 {
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
        int product=1;

        for(int i=0;i<n;i++)
        {
           product*=a[i];
        }
        System.out.println("The product of all element of array is "+" "+product);
    }
    
}


