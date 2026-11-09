package array;
import java.util.Scanner;
public class searchinanarray {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an element to search in the array");
        int n=sc.nextInt();

        int[] a={1,2,3,4,5,6,7,8,9,10};
        int index=-1;

        for(int i=0;i<a.length;i++)
        {
            if(a[i]==n)
            {
                index=i;
                System.out.println(n+" found at "+index+"th element of the array");
                break;
            }
        }
        if(index==-1)
        System.out.println("Element not found");
    }
}
