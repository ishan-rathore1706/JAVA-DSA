package array;

import java.util.Arrays;

public class shallowcopydeepcopy {
    public static void main(String[] args)
    {
        int[] a={1,2,4,511,232};
        int[]x=a; //x is a shallow copy of a
        System.out.println(a[1]);
        x[1]=19;
        System.out.println(a[1]);
        int[] deep=Arrays.copyOf(a, a.length);
        deep[1]=15; //deep is a deep copy of a
        System.out.println(deep[1]);
        System.out.println(a[1]);

    }
    
}
