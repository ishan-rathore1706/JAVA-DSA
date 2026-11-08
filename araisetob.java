import java.util.Scanner;
class araisetob
{
    public static void main(String args[])

    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a and b");
        int a=sc.nextInt();
        int b=sc.nextInt();

   int c=a;
        for(int i=1;i<b;i++)
        {
            a=c*a;
        }

        System.out.println(c+" raise to the power "+b+" is"+" "+a);
    }
}