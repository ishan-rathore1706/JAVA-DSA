package array;

public class MissingInArrayElement {
    public static void main(String[] args) {
        int a[]={1,2,3,5};

        int n=a.length;
        int sum1=((n+1)*(n+2))/2;
        int sum=0;
        for(int ele: a)
        {
            sum+=ele;
        }
        System.out.println(sum1-sum);
    }
    
}
