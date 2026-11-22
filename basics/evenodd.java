package basics;
import java.util.Scanner;
public class evenodd {
    
 public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number to check if it is even or odd:");
        int n=sc.nextInt();

        if((n%2==0)&&(n!=0))
       System.out.println(n+" "+"is even");

         else if(n%2!=0)
            System.out.println(n+" "+"is odd");

         else
        System.out.println(n+" is zero");

         sc.close();
    }
}