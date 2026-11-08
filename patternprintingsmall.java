import java.util.Scanner;
class patternprintingsmall
{
    public static void main(String[] args)
    {
        int n;
        System.out.println("Enter value of n");
        Scanner sc=new Scanner(System.in);
         n=sc.nextInt();
        int i;
        for(i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
               if(i%2==0)
                System.out.print((char)(j+64));

               else 
                System.out.print(j);
            }
            System.out.println();
        }

    }
}