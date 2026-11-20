package array;
import java.util.Scanner;
public class ProductOfArray {
    public static void main(String[] args) {
        
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter length of array");
          int n=sc.nextInt();
          int[] a=new int[n];
          System.out.println("Enter elemnts of array");
          long p=1;
          for(int i=0;i<n;i++)
          {
            a[i]=sc.nextInt();
           p*=a[i];
          }
    System.out.println("Product of all elements of the array is "+p);
    }
    
}
