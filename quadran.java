import java.util.Scanner;
class quadran
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter coordinates of x and y");
        int x=sc.nextInt();
        int y=sc.nextInt();

        if(x>0&&y>0)
            System.out.println("First quadrant");

        else if(x<0&&y>0)
            System.out.println("Second quadrant");

        else if(x<0&&y<0)
            System.out.println("Third quadrant");

        else if(x>0&&y<0)
            System.out.println("Fourth quadrant");

        else if(x==0&&y==0)
            System.out.println("Origin");

        else if(x==0&&y!=0)
            System.out.println("Y axis");

    else 
        System.out.println("X axis");
    
    sc.close();
}
}