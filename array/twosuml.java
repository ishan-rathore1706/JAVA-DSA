package array;
import java.util.Scanner;
public class twosuml {
    
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter length of array");
       int n=sc.nextInt();

       System.out.println("Enter elements of the array");
       int [] a=new int[n];
       for(int i=0;i<n;i++)
       {
         a[i]=sc.nextInt();
       } 

       System.out.println("Enter the number whose sum you are looking for");
       int s=sc.nextInt();
   boolean flag=false ;int k=0, q=0;
          for(int i=0;i<n;i++)
       {
        int b=a[i];
        for(int j=i+1;j<n;j++)
        {
            if((b+a[j])==s)
            {
                flag=true;
                k=i;
                q=j;
            }

             
        }
        
       }
       if(flag)
        {
            System.out.println("The sum of "+s+" is found at index "+k +" and "+q+" they are "+a[k] +" and "+a[q]);
        }
        else 
            System.out.println("Not found the sum");
    }
}
