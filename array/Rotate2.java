package array;
import java.util.Scanner;
public class Rotate2 {
public static void rotate(int a[],int n,int m)
{
  while(n<m)
  {
    int t=a[n];
    a[n]=a[m];
    a[m]=t;
    n++;
    m--;
  }

}

    public static void main(String[] args) {
        int []a={1,2,3,4,5,6,7};
Scanner sc=new Scanner(System.in);
System.out.println("Enter value of k");
int k=sc.nextInt();
   int n=a.length;
   if(k>n)
    k=k%n;
    rotate(a,0,n-1);
    rotate(a,0,k-1);
    rotate(a,k,n-1);
  
    for(int ele: a)
    {
        System.out.print(ele+" ");
    }
    

    }
    
}
