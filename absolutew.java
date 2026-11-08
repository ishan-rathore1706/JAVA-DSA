import java.util.Scanner;
class absolutew
{
 public static void main(String args[])
 {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a number to get absolute value");
    int n=sc.nextInt();
    
    if(n<0)
     {
        System.out.println("Absolute value of "+n+" is "+(-n));
        return;

     }

     System.out.println("Absolute value of "+n+" is " +n);



    
    sc.close();
   }
}
