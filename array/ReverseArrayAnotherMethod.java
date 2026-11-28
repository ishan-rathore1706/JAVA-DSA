package array;
import java.util.Scanner;
public class ReverseArrayAnotherMethod {
    public static void main(String[] args) {
        
    
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter length of array");
    int n=sc.nextInt();
 int[] a=new int[n];
System.out.println("Enter elements of array");

for (int i = 0; i < n; i++)
     {
    a[i]=sc.nextInt();
}

  int j=n-1;
  int i=0;
  while(i<j)    
  {
    int t=a[i];
    a[i]=a[j];
    a[j]=t;

    i++;
    j--;
  }
  System.out.print("Reversed Array: ");
  for(int ele :a)
  {
    System.out.print(ele+" ");
  }
}
}
