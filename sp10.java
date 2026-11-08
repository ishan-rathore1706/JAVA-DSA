import java.util.Scanner;
class sp10
{
    public static void main(String args[])
    {
        System.out.println("Enter value of n");
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=1;i<=n;i++)
        {
                for(int k=1;k<=n-i;k++)
        {
            System.out.print("  ");
        }
            for(int j=1;j<=2*i-1;j++)
            {
        
             System.out.print("* ");
                

            }
        
    
System.out.println();
            
            
        }
    }
}