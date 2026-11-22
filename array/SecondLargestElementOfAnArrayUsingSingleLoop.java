package array;

public class SecondLargestElementOfAnArrayUsingSingleLoop {
    
    
    public static void main(String[] args) {
        
        int a[]={1,2,3,4,4,3,2,1};
     int max=Integer.MIN_VALUE;
     int max2=Integer.MIN_VALUE;
     
        for(int i=0;i<a.length;i++)
        {
            if(max<a[i])
            {
                max2=max; //max2 is previous max
                max=a[i];
                

            }
       else if(max2<a[i]&&max>a[i])
        {
            max2=a[i];
        }
           
             
        }
        System.out.println("Second largest element in the array is "+max2);
      
    }
}
