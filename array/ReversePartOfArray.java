package array;


public class ReversePartOfArray {
        
    public static void main(String[] args) {
        int [] a={ 3,19,56,9,83,18,24,85,14}; 
        int j=5;int temp;
         int i=2;
        while(i<j)
        {
            temp=a[i];       
            a[i]=a[j];
            a[j]=temp;
            j--;
            i++;
        }
        /*for( i=2;i<j;i++)
        {
             temp=a[i];       
            a[i]=a[j];
            a[j]=temp;
            j--;
            System.out.print(a[i]+" ");
        }
    */ //same thing with for loop;
        System.out.println("\nReversed array :");
        for(int ele:a)
        {
            System.out.print(ele+" ");
            
        }
    }
}
