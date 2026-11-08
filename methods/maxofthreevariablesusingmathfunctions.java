package methods;
import java.util.Scanner;
public class maxofthreevariablesusingmathfunctions {
    public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter three numbers");
    int a=sc.nextInt();
      int b=sc.nextInt();
        int c=sc.nextInt();
    System.out.println(Math.max(Math.max(a,b),c));
    System.out.println(Math.ceil(3));
    }
    
}
