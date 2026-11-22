package array;
import java.util.Scanner;;
public class seconlargestelementofarray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a[]={83,45,83,23,83,5,2,8,7};
     int max=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++)
        {
            if(max<a[i])
                max=a[i];
        }
        int max2=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++)
        {
            if(max2<a[i]&&a[i]<max)
                max2=a[i];
        }
        System.out.println("Second largest element in the array is "+max2);
    }
}
