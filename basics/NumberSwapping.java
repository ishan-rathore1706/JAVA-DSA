package basics;
import java.util.*;
public class NumberSwapping {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two variables to swap");
        int a=sc.nextInt();
        int b=sc.nextInt();

        int t=a;
        a=b;
        b=t;
        System.out.println("Swapped variables "+ a+" "+b);
    }

}
