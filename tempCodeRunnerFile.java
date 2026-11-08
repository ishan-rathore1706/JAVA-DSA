import java.util.Scanner;
class sp12
{
    public static void main(String args[])
    {
        System.out.println("Enter value of n");
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
  int nsp=n-1,nst=1;
        for(int i=1;i<=n*2-1;i++)
        {
                for(int k=1;k<=nsp;k++)
        {
            System.out.print("  ");
        }
            for(int j=1;j<=nst;j++)
            {
        
             System.out.print("* ");
                

            }
   if(i<n){


        nsp--;
        nst+=2;
   }
   else{
    nsp++;
    nst-=2;
   }
System.out.println();
            
            
        }
    }
}