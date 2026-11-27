package array;
import java.util.*;;
public class ReverseArray {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length of array:");
        int n=sc.nextInt();
        System.out.println("Enter elements of array");
          int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }

        int j=n-1;int temp;
        for(int i=0;i<n/2;i++)
        {
             temp=a[i];       //Swapping first and last variales to reverse the array
            a[i]=a[j];
            a[j]=temp;
            j--;
        }
        
        System.out.println("Reversed array :");
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
            
        }
    }

}
