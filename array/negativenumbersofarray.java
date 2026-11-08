package array;

public class negativenumbersofarray {
    public static void main (String[] args)
    {
         int[] a={1,-3,-54,-839,9238,-2938};


         for(int i=0;i<a.length;i++)
         {
            if(a[i]<0)
                System.out.print(a[i]);
         }
    }
}
