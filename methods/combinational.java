package methods;
import java.util.Scanner;
public class combinational 
    {
        public static int fact(int x)
        {
            int fact=1;
            for(int i=1;i<=x;i++)
            {
                fact=fact*i;
            }
            return fact;
        }
        public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter value of n and r");
            int n=sc.nextInt();
            int r=sc.nextInt();

            int ncr=fact(n)/((fact(r))*(fact(n-r)));
            int npr=fact(n)/((fact(n-r)));
            System.out.println("Ncr = "+ncr);
            System.out.println("Npr = "+npr);
        }
    }
    

