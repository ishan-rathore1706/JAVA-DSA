package array;
import java.util.Scanner;
public class sumofallelementsofarray 
    {
        public static void main(String[]args)
        {5
           Scanner sc=new Scanner(System.in);
           System.out.println("Enter size of array");
           int n=sc.nextInt();

           int[] a=new int[n];
           System.out.println("Enter elements of array");
           for(int i=0;i<n;i++)
           {
            a[i]=sc.nextInt();
           
           }
           int sum=0;
           for(int i=0;i<n;i++)
           {
            sum+=a[i];
           }
           System.out.println("The sum of all elemetns of the array is "+ " "+sum);
        }
    }
    

