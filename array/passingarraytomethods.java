package array;

public class passingarraytomethods {

    public static void main(String[] args)
    {
        int[] a={10,24,93,92,71,75};
System.out.println(a[2]);
change(a);
System.out.println(a[2]);
    }
    public static void change(int[] y)
    {
        y[2]=69;
    }
}
